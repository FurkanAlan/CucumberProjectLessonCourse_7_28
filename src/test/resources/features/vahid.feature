Feature:vahid code


  Background: Become on Instructor
    Given I navigate to home page
    Then I wait for 6000 milliseconds
    When I click on Become an intructor
    Then I wait for 4000 milliseconds
    Then I enter username and password
    Then I wait for 2000 milliseconds
    Then I click on log-in button
    Then I wait for 4000 milliseconds


  @vahid
    Scenario:Checking functionally of cart
      Given I click on categories
      Then I wait for 4000 milliseconds
     Then  I mouse over on academic coaching
    Then I wait for 4000 milliseconds
    Then I click on Basic coaching skills
    Then I wait for 6000 milliseconds
    Then I click on add to card
    And verify it is in the card with checking price






