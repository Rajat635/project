Feature: Login

  Scenario Outline: Login App
    Given user launches iebrowser And navigates to application url
    And enter user name as "<userName>" in Username  field
    And enter password as "<password>" in password field
    And click on login button

    Examples: 
      | userName | password    |
      | Lalitha  | Password123 |
