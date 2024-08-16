Feature: Products and Feedback

  Scenario: User views posts
    Given the user is logged in for products screen
    When the user opens the Products and Recipes frame
    And the user clicks on the products screen button "Show Posts"
    Then the user should see the posts listed

  Scenario: User views recipes
    Given the user is logged in for products screen
    When the user opens the Products and Recipes frame
    And the user clicks on the products screen button "Show Recipes"
    Then the user should see the recipes listed

  Scenario: User adds feedback on a product
    Given the user is logged in for products screen
    When the user opens the Products and Recipes frame
    And the user clicks on the products screen button "Add Feedback on a Product"
    Then the user should see a confirmation message on products screen "Feedback added successfully"
