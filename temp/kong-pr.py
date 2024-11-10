import os
import subprocess
import sys
from git import Repo

def clone_repo(repo_url, clone_dir):
    try:
        print(f"Cloning repository from {repo_url} into {clone_dir}...")
        Repo.clone_from(repo_url, clone_dir)
        print(f"Repository cloned successfully.")
    except Exception as e:
        print(f"Failed to clone repository: {e}")
        sys.exit(1)

def replace_health_check_path(file_path, repo_name):
    replacements = {
        "health_check_path: /healthcheck": f"health_check_path: /{repo_name}/healthcheck",
        "alb.ingress.kubernetes.io/healthcheck-path: /healthcheck": f"alb.ingress.kubernetes.io/healthcheck-path: /{repo_name}/healthcheck"
    }

    try:
        with open(file_path, 'r') as f:
            content = f.read()
        for old_value, new_value in replacements.items():
            if old_value in content:
                content = content.replace(old_value, new_value)
                print(f"Replaced '{old_value}' with '{new_value}' in {file_path}.")
        with open(file_path, 'w') as f:
            f.write(content)

    except Exception as e:
        print(f"Error replacing paths in {file_path}: {e}")



def update_env_files(repo_path, repo_name):
    env_files = ['deploy/helm/environments/staging/values.yaml.gotmpl', 'deploy/helm/environments/sandbox/values.yaml.gotmpl', 'deploy/helm/environments/production/values.yaml.gotmpl']

    kong_internal_block = f"""
kongInternal:
  enabled: true
  resource_version: RESOURCE_VERSION
  path: {repo_name}
  strip_path: true
"""
    for env_file in env_files:
        file_path = os.path.join(repo_path, env_file)
        if os.path.exists(file_path):
            print(f"Updating {env_file}...")

            replace_health_check_path(file_path, repo_name)
            try:
                with open(file_path, 'a') as f:
                    f.write(kong_internal_block)
                print(f"Updated {env_file} successfully.")
            except Exception as e:
                print(f"Error updating {env_file}: {e}")
        else:
            print(f"{env_file} does not exist in the repository.")

def create_pr(clone_dir):
    os.system(f"cd {clone_dir}")
    os.system("pwd")
    os.system("git checkout -b BTA-14493-enable-kong-ingress")
    os.system("git add .")
    os.system("git commit -m 'BTA-14493: Enable Kong Ingress so as to move from individual ELBs as a cost saving measure'")
    os.system("git push origin BTA-14493-enable-kong-ingress")
    os.system("gh pr create --title 'BTA-14493: Enable Kong Ingress' --body 'BTA-14493: This PR Creates internal Kong ingress. This is to consolidate all the apps to Kong ' --base master --head BTA-14493-enable-kong-ingress")
    os.system("cd -")



def main():

    bitpesa_gh  = "git@github.com:bitpesa/"

    # projects_list = ["orabank-service",
    # "report-engine",
    # "wave-transfer",
    # "korba-service",
    # "access-bank-service",
    # "cinetpay-service",
    # "vision-bank-service",
    # "tiltpay-service",
    # "astropay-service",
    # "adwapay-service",
    # "localpayment-service",
    # "mtn-service",
    # "monnify-service",
    # "adib-bank-service",
    # "nsano-service",
    # "moneygram-service",
    # "lhv-service",
    # "zenith-bank-service",
    # "interpay-africa-service",
    # "paydunya-service",
    # "wise-rails-service",
    # "bidvest-service",
    # "flex-money-transfer-service",
    # "payonous-service",
    # "airtel-service",
    # "liquidity-request-service"]

    projects_list = ["cinetpay-service"]

    for project in projects_list:

        repo_url = bitpesa_gh + project + ".git"

        dir_location = f"/tmp/{project}"

        clone_dir = os.path.join(os.getcwd(), dir_location)

        clone_repo(repo_url, clone_dir)
        update_env_files(clone_dir, project)
        create_pr(clone_dir)

if __name__ == "__main__":
    main()
