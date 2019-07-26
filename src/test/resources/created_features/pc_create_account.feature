@CreateAccount
Feature: Creating an Account
  Scenario: Scene 1
    Given I'm on desktop view page
    When I clicked Action Button
    And I clicked New Account
    Then I should See Account Search Page

  Scenario: Scene 2
    Given I'm on Account Search Page
    When I enter <FirstName>
    And I enter <LastName>
    And I click the search button
    And The Create New Account button appeared
    And I clicked the Create New Account button
    And The dropdown for account type appeared
    And I clicked the Person account type
    Then The page should redirect to Create Account Page

  Scenario: Scene 3
    Given I'm on the Create Account Page
    When I enter <FirstName>
    And I enter <LastName>
    And I enter <HomePhone>
    And I enter <WorkPhone>
    And I enter <MobilePhone>
    And I enter <FaxPhone>
    And I select <PrimaryPhone>
    And I enter <PrimaryEmail>
    And I enter <SecondaryEmail>
    And I enter <Country>
    And I enter <Address>
    And I enter <City>
    And I enter <County>
    And I enter <State>
    And I enter <ZipCode>
    And I select <AddressType>
    And I enter <Description>
    And I enter <SSN>
    And I select <Organization>
    And I select <ProducerCode>
    And I clicked Update Button
    Then I should see my created account summary

Examples:
  |FirstName|LastName|HomePhone|WorkPhone|MobilePhone|FaxPhone|PrimaryPhone|PrimaryEmail|SecondaryEmail|Country|Address|City|County|State|ZipCode|AddressType|Description|SSN|Organization|ProducerCode|
  |"Luis John"|"Terrado"|"714-921-9194"|"999-887-9889"|"921-714-9491"|"989-868-7887"|"Home"|"ljprimaryemail@email.com"|"ljsecondaryemail@email.com"|"United States"|"145 Providence Lane"|"Mira Loma"|"San Diego"|"California"|"91752"|"Home"|"LJ Account"|"714-21-9194"|"ACV Property Insurance"|"301-008578 ACV Property Insurance"|
