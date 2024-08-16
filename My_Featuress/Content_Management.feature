Feature: Content Management Frame

  Scenario: Display posts in Content Management Frame
    Given a database with the following owners and products
      | ownerName | productName      | price | allergic | feedbacks                 |
      | Ali       | Blueberry Muffin | 11.99 | No       | Fresh, Delicious          |
      | Clara     | Carrot Cake      | 9.30  | Yes      | Moist, Flavorful          |
      | David     | Cheesecake       | 13.50 | No       | Creamy, Refreshing        |
    When I click the "show posts" button
    Then the text area should display the following posts
      """
      Owner: Ali, Product Name: Blueberry Muffin, Price: 11.99, Allergic: No, Feedbacks: Fresh, Delicious
      Owner: Clara, Product Name: Carrot Cake, Price: 9.30, Allergic: Yes, Feedbacks: Moist, Flavorful
      Owner: David, Product Name: Cheesecake, Price: 13.50, Allergic: No, Feedbacks: Creamy, Refreshing
      """

  Scenario: Display recipes in Content Management Frame
    Given a database with the following users and recipes
      | userName | recipeName        | recipe           | allergic | feedbacks             |
      | Emma     | Chocolate Chip    | Chip Recipe      | No       | Crispy, Delicious     |
      | Frank    | Banana Bread      | Bread Recipe     | Yes      | Moist, Lovely Flavor  |
    And the following owners and recipes
      | ownerName | recipeName        | recipe         | allergic | feedbacks            |
      | Clara     | Red Velvet Cake   | Velvet Recipe  | No       | Soft, Rich           |
      | David     | Lemon Drizzle     | Drizzle Recipe | Yes      | Zesty, Refreshing    |
    When I click the "show recipes" button
    Then the text area should display the following recipes
      """
      User: Emma, Recipe Name: Chocolate Chip, Recipe: Chip Recipe, Allergic: No, Feedbacks: Crispy, Delicious
      User: Frank, Recipe Name: Banana Bread, Recipe: Bread Recipe, Allergic: Yes, Feedbacks: Moist, Lovely Flavor
      Owner: Clara, Recipe Name: Red Velvet Cake, Recipe: Velvet Recipe, Allergic: No, Feedbacks: Soft, Rich
      Owner: David, Recipe Name: Lemon Drizzle, Recipe: Drizzle Recipe, Allergic: Yes, Feedbacks: Zesty, Refreshing
      """
