

# Sender

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Type of sender to create - either person or business (defaults to person)  |  [optional]
**state** | [**SenderState**](SenderState.md) |  |  [optional]
**country** | **String** | Country of sender in 2-character alpha ISO 3166-2 country format. This is the residential country for personal senders and the country of incorporation for business senders. | 
**street** | **String** | Sender&#39;s street | 
**postalCode** | **String** | Zip code of sender | 
**city** | **String** | Sender&#39;s city | 
**phoneCountry** | **String** | Phone country of sender in 2-character alpha ISO 3166-2 country format | 
**phoneNumber** | **String** | Phone number of sender (without country callcode) |  [optional]
**email** | **String** | Email of sender | 
**ip** | **String** | IP of sender | 
**addressDescription** | **String** | Description of address |  [optional]
**identificationNumber** | **String** | Identification number of document used |  [optional]
**identificationType** | [**IdentificationTypeEnum**](#IdentificationTypeEnum) | Document to be identified. The identification type can be one of the following:  - &#x60;DL&#x60;: Driving License - &#x60;PP&#x60;: International Passport - &#x60;ID&#x60;: National ID - &#x60;OT&#x60;: Other  Please note for Wizall &#x60;XOF::Cash&#x60; transactions the valid options are: - &#x60;ID&#x60;: National ID - &#x60;PP&#x60;: Passport |  [optional]
**lang** | **String** | Determines language of the served content. Defaults to English |  [optional]
**name** | **String** | Name of sender (used only with a Business sender) |  [optional]
**firstName** | **String** | First name of sender (used only with a Personal sender) |  [optional]
**middleName** | **String** | Middle name of sender (used only with a Personal sender) |  [optional]
**lastName** | **String** | Last name of sender (used only with a Personal sender) |  [optional]
**birthDate** | [**LocalDate**](LocalDate.md) | Date of birth of sender (used only with a Personal sender) |  [optional]
**occupation** | **String** | Occupation of sender (used only with a Personal sender) |  [optional]
**nationality** | **String** | The nationality of the sender (used only with a Personal sender) |  [optional]
**legalEntityType** | [**LegalEntityTypeEnum**](#LegalEntityTypeEnum) | Legal entity type (used only with a Business sender)  Available values:   - sole_proprietorship: Sole Proprietorship   - partnership: Partnership   - privately_owned_company: Privately Owned Company (Limited Company)   - publicly_owned_company: Publicly Listed Company (PLC)   - government_owned_entity: Government Owned Entity Trusts   - trust: Foundations &amp; Similar Entities   - ngo: Non-Government Organisations / Charities inc Religious bodies and place of worship   - club_and_society: Clubs and Societies   - go: GO (Majority Owned Subsidiary of State-Owned Company)   - financial_institution: Financial Institution   - mto: Money Transfer Operator (MTO) / Other Licensed Financial Institution  Please note not all values are acceptable for some our corridors. Please reach out to our sales teams for more information.  Note that if you select &#x60;financial_institution&#x60; then the fields &#x60;vat_registration_number&#x60;, &#x60;financial_regulator&#x60; and &#x60;regulatory_licence_number&#x60; will be mandatory as well. |  [optional]
**registrationDate** | [**LocalDate**](LocalDate.md) | The registration date (used only with a Business sender) |  [optional]
**registrationNumber** | **String** | The registration number (used only with a Business sender) |  [optional]
**natureOfBusiness** | [**NatureOfBusinessEnum**](#NatureOfBusinessEnum) | Nature of business options (used only with a Business sender)  Available values:   - personal: Personal   - agriculture_and_hunting: Agriculture and Hunting   - forestry: Forestry   - fishing: Fishing   - agricultural_by_products: Agricultural By-Products   - coal_mining: Coal Mining   - oil_mining: Oil Mining   - iron_ore_mining: Iron Ore Mining   - other_metal_and_diamond_mining: Other Metal and Diamond Mining   - other_mineral_mining: Other Mineral Mining   - manufacturing_of_food_drink_tobacco: Manufacture of Food/Drink/Tobacco   - manufacturing_of_textiles_leather_fur_furniture: Manufacture of Textiles/Leather/Fur/Furniture   - manufacture_of_wooden_products_furniture: Manufacture of Wooden Products/Furniture   - manufacture_of_paper_pulp_allied_products: Manufacture of Paper/Pulp/Allied Products   - manufacture_of_chemicals_medical_petroleum_rubber_plastic_products: Manufacture Of Chemicals Medical Petroleum Rubber Plastic Products   - manufacture_of_pottery_china_glass_stone: Manufacture Of Pottery China Glass Stone   - manufacture_of_iron_steel_non_ferrous_metals_basic_industries: Manufacture Of Iron Steel Non-Ferrous Metals Basic Industries   - manufacture_of_metal_products_electrical_and_scientific_engineering: Manufacture Of Metal Products Electrical And Scientific Engineering   - manufacture_of_jewelry_musical_instruments_toys: Manufacture Of Jewelry Musical Instruments Toys   - electricity_gas_and_water: Electricity, Gas And Water   - construction: Construction   - wholesale_trade: Wholesale Trade   - retail_trade: Retail Trade   - catering_incl_hotels: Catering Incl. Hotels   - transport_storage: Transport Storage   - communications: Communications   - finance_and_holding_companies: Finance And Holding Companies   - insurance: Insurance   - business_services: Business Services   - real_estate_development_investment: Real Estate Development Investment   - central_state_governments: Central State Governments   - community_services_defence_police_prisons_etc: Community Services Defence Police Prisons Etc   - social_services_education_health_care: Social Services Education Health Care   - personal_services_leisure_services: Personal Services - Leisure Services   - personal_services_domestic_laundry_repairs: Personal Services - Domestic Laundry Repairs   - personal_services_embassies_international_organisations: Personal Services - Embassies |  [optional]
**sourceOfFunds** | **String** | The source of funds |  [optional]
**customSourceOfFunds** | **String** | Custom source of funds |  [optional]
**coreBusinessActivity** | **String** | The core activity (used only with a Business sender) |  [optional]
**purposeOfOpeningAccount** | **String** | The purpose for opening their account (used only with a Business sender) |  [optional]
**officePhone** | **String** | The official phone number (used only with a Business sender) |  [optional]
**vatRegistrationNumber** | **String** | The VAT registration number (used only with a Business sender) |  [optional]
**financialRegulator** | **String** | The Financial Regulator (used only with a Business sender) |  [optional]
**regulatoryLicenceNumber** | **String** | The Regulatory Licence Number (used only with a Business sender) |  [optional]
**contactPersonEmail** | **String** | The contact&#39;s email address (used only with a Business sender) |  [optional]
**tradingCountry** | **String** | The Business trading country (used only with a Business sender) |  [optional]
**tradingAddress** | **String** | The Business trading address (used only with a Business sender) |  [optional]
**tradingName** | **String** | The Business trading name (used only with a Business sender) |  [optional]
**numberMonthlyTransactions** | **String** | The estimated number of monthly transactions (used only with a Business sender) |  [optional]
**amountMonthlyTransactions** | **String** | The estimated amount for all transactions each month in USD (used only with a Business sender) |  [optional]
**documents** | [**List&lt;Document&gt;**](Document.md) | Needed for KYC checks. Required to approve the sender unless KYC is waived for your account. Please send us an empty list of documents: &#x60;\&quot;documents\&quot;: [ ]&#x60; in the request if KYC has been waived.  If the documents already exist, please send the Document ID eg. &#x60;&#x60;&#x60;JSON \&quot;documents\&quot;: [   {     \&quot;id\&quot;: \&quot;b6648ba3-1c7b-4f59-8580-684899c84a07\&quot;   } ] &#x60;&#x60;&#x60; | 
**metadata** | [**Object**](.md) | Metadata of sender. You can store any detail specific to your integration here (for example the local ID of the sender on your end). When requesting sender details you will receive the sent metadata back. Also when sending sender related webhooks you will receive the details stored here as well. |  [optional]
**errors** | [**Map&lt;String, List&lt;ValidationErrorDescription&gt;&gt;**](List.md) | The fields that have some problems and don&#39;t pass validation |  [optional]
**onboardingStatus** | **String** | The onboarding status of the sender |  [optional]
**politicallyExposedPeople** | [**List&lt;PoliticallyExposedPerson&gt;**](PoliticallyExposedPerson.md) | An optional list of politically exposed people, individuals who are or have been entrusted with prominent public functions by a country, for example heads of state or heads of government, senior politicians, senior government, judicial or military officials, senior executives of state owned corporations, important political party officials.  There is a limit of three (3) politically exposed people per Sender.  Politically exposed person example: &#x60;&#x60;&#x60;json   {     \&quot;politically_exposed_person\&quot;: {       \&quot;name\&quot;: \&quot;Ronald Reagan\&quot;,       \&quot;position\&quot;: \&quot;President of the United States\&quot;,       \&quot;started_date\&quot;: \&quot;1981-01-20T00:00:00.000Z\&quot;,       \&quot;ended_date\&quot;: \&quot;1989-01-20T00:00:00.000Z\&quot;,       \&quot;sender_id\&quot;: \&quot;344fb668-196d-43db-9d94-b34b7e6c7e0b\&quot;     }   } &#x60;&#x60;&#x60; |  [optional]
**externalId** | **String** | Optional ID that is supplied by partner linking it to the partner&#39;s own Sender ID. Note: if present we will validate whether the sent ID is a duplicate in our system or not. |  [optional]
**cityOfBirth** | **String** | City of birth of sender |  [optional]
**countryOfBirth** | **String** | Country of birth of sender in 2-character alpha ISO 3166-2 country format |  [optional]
**gender** | [**GenderEnum**](#GenderEnum) | The gender of the sender:  - &#x60;M&#x60;: Male - &#x60;F&#x60;: Female - &#x60;O&#x60;: Other |  [optional]
**salesLeadId** | **String** | Sales Lead ID for tracking (optional) |  [optional]
**createdAt** | **String** | Date and time of sender was created |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
PERSON | &quot;person&quot;
BUSINESS | &quot;business&quot;



## Enum: IdentificationTypeEnum

Name | Value
---- | -----
DL | &quot;DL&quot;
PP | &quot;PP&quot;
ID | &quot;ID&quot;
OT | &quot;OT&quot;



## Enum: LegalEntityTypeEnum

Name | Value
---- | -----
SOLE_PROPRIETORSHIP | &quot;sole_proprietorship&quot;
PARTNERSHIP | &quot;partnership&quot;
PRIVATELY_OWNED_COMPANY | &quot;privately_owned_company&quot;
PUBLICLY_OWNED_COMPANY | &quot;publicly_owned_company&quot;
GOVERNMENT_OWNED_ENTITY | &quot;government_owned_entity&quot;
TRUST | &quot;trust&quot;
NGO | &quot;ngo&quot;
CLUB_AND_SOCIETY | &quot;club_and_society&quot;
GO | &quot;go&quot;
OTHER | &quot;other&quot;
FINANCIAL_INSTITUTION | &quot;financial_institution&quot;
MTO | &quot;mto&quot;



## Enum: NatureOfBusinessEnum

Name | Value
---- | -----
PERSONAL | &quot;personal&quot;
AGRICULTURE_AND_HUNTING | &quot;agriculture_and_hunting&quot;
FORESTRY | &quot;forestry&quot;
FISHING | &quot;fishing&quot;
AGRICULTURAL_BY_PRODUCTS | &quot;agricultural_by_products&quot;
COAL_MINING | &quot;coal_mining&quot;
OIL_MINING | &quot;oil_mining&quot;
IRON_ORE_MINING | &quot;iron_ore_mining&quot;
OTHER_METAL_AND_DIAMOND_MINING | &quot;other_metal_and_diamond_mining&quot;
OTHER_MINERAL_MINING | &quot;other_mineral_mining&quot;
MANUFACTURING_OF_FOOD_DRINK_TOBACCO | &quot;manufacturing_of_food_drink_tobacco&quot;
MANUFACTURING_OF_TEXTILES_LEATHER_FUR_FURNITURE | &quot;manufacturing_of_textiles_leather_fur_furniture&quot;
MANUFACTURE_OF_WOODEN_PRODUCTS_FURNITURE | &quot;manufacture_of_wooden_products_furniture&quot;
MANUFACTURE_OF_PAPER_PULP_ALLIED_PRODUCTS | &quot;manufacture_of_paper_pulp_allied_products&quot;
MANUFACTURE_OF_CHEMICALS_MEDICAL_PETROLEUM_RUBBER_PLASTIC_PRODUCTS | &quot;manufacture_of_chemicals_medical_petroleum_rubber_plastic_products&quot;
MANUFACTURE_OF_POTTERY_CHINA_GLASS_STONE | &quot;manufacture_of_pottery_china_glass_stone&quot;
MANUFACTURE_OF_IRON_STEEL_NON_FERROUS_METALS_BASIC_INDUSTRIES | &quot;manufacture_of_iron_steel_non_ferrous_metals_basic_industries&quot;
MANUFACTURE_OF_METAL_PRODUCTS_ELECTRICAL_AND_SCIENTIFIC_ENGINEERING | &quot;manufacture_of_metal_products_electrical_and_scientific_engineering&quot;
MANUFACTURE_OF_JEWELRY_MUSICAL_INSTRUMENTS_TOYS | &quot;manufacture_of_jewelry_musical_instruments_toys&quot;
ELECTRICITY_GAS_AND_WATER | &quot;electricity_gas_and_water&quot;
CONSTRUCTION | &quot;construction&quot;
WHOLESALE_TRADE | &quot;wholesale_trade&quot;
RETAIL_TRADE | &quot;retail_trade&quot;
CATERING_INCL_HOTELS | &quot;catering_incl_hotels&quot;
TRANSPORT_STORAGE | &quot;transport_storage&quot;
COMMUNICATIONS | &quot;communications&quot;
FINANCE_AND_HOLDING_COMPANIES | &quot;finance_and_holding_companies&quot;
INSURANCE | &quot;insurance&quot;
BUSINESS_SERVICES | &quot;business_services&quot;
REAL_ESTATE_DEVELOPMENT_INVESTMENT | &quot;real_estate_development_investment&quot;
CENTRAL_STATE_GOVERNMENTS | &quot;central_state_governments&quot;
COMMUNITY_SERVICES_DEFENCE_POLICE_PRISONS_ETC | &quot;community_services_defence_police_prisons_etc&quot;
SOCIAL_SERVICES_EDUCATION_HEALTH_CARE | &quot;social_services_education_health_care&quot;
PERSONAL_SERVICES_LEISURE_SERVICES | &quot;personal_services_leisure_services&quot;
PERSONAL_SERVICES_DOMESTIC_LAUNDRY_REPAIRS | &quot;personal_services_domestic_laundry_repairs&quot;
PERSONAL_SERVICES_EMBASSIES_INTERNATIONAL_ORGANISATIONS | &quot;personal_services_embassies_international_organisations&quot;



## Enum: GenderEnum

Name | Value
---- | -----
M | &quot;M&quot;
F | &quot;F&quot;
O | &quot;O&quot;



