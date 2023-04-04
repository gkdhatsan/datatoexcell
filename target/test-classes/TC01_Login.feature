@Login
Feature: Verify Adactin Hotel Login Details

  Scenario Outline: Verify Adactin Hotel Login With Valid Credentials
    Given User is on Adactin Home Page
    When User Should Perform Login "<sheetName>",rownumber<rowNumber> and cellnumber<cellNumber>
    Then User Should Verify Welcome Message After Login "Hello Greens8767!"

    Examples: 
      | sheetName | rowNumber | cellNumber |
      | rose      |         0 |          0 |
