Feature: Search functionality
  @onlytest
  Scenario Outline: Search the buy car with model
    Given I am on homepage
    When I mouse hover on 'buy+sell' tab
    And I click ‘Search Cars’ link
    Then I navigate to ‘new and used car search’ page
    And I select car make "<make>"
    And I select car model "<model>"
    And I select car location "<location>"
    And I select car price "<price>"
    And I click on Find My Next Car tab
    Then I should see the make in results
    Examples:
      | make | model   | location | price |
      |Tesla | Model 3 |Liverpool |$49,900 |
      |BMW   | 330D    |Thornleigh|$28,990 |
      |Audi  | Q5      |BlackTown |$31,880 |
      |Toyota| Yaris   |BlackTown |$19,990 |
      |Honda | CR-V    |BlackTown |$21,999 |
      |Honda | Leaf    |Leichardt |$36,000 |


  Scenario Outline: Search the used car with model
    Given I am on homepage
    When I mouse hover on 'buy+sell' tab
    And I click on used car 'Used' link
    Then I navigate to 'Used Cars For Sale' page
    And I select CarMake "<make>"
    And I select CarModel "<model>"
    And I select CarLocation "<location>"
    And I select CarPrice "<price>"
    And I click on Find My Next Car tab
    Then I should see the make make in results
    Examples:
      | make  | model | location       | price  |
      | Audi  | Q2    | Seven Hills    | 24,990 |
      | BMW   | 520D  | Port Melbourne | 17,980 |
      |Honda  | CR-V  | Lansvale       | 13,990 |
      |Hyundai| iX34  | Minchinbury    | 14,995 |
      |Hyundai| iX34  | Minchinbury    | 14,995 |
      |Honda  | CR-V  | Lansvale       | 13,990 |

