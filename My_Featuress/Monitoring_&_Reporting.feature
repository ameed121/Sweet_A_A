Feature: Monitoring and Reporting

  Scenario: Display users ordered by city
    Given the account management system database is initialized for monitoring and reporting
    When the admin opens the Monitoring and Reporting frame
    And the admin clicks on "Statistics" button
    Then the users should be displayed ordered by city

  Scenario: Display best-selling product
    Given the account management system database is initialized for monitoring and reporting
    When the admin opens the Monitoring and Reporting frame
    And the admin clicks on "Best-Selling" button
    Then the best-selling product should be displayed

  Scenario: Display profits
    Given the account management system database is initialized for monitoring and reporting
    When the admin opens the Monitoring and Reporting frame
    And the admin clicks on "Profits" button
    Then the profits should be displayed
