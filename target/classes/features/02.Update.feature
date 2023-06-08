Feature: User update data employee

  Scenario: Update data new employee
    When Click PIM
    And  Search name
    And  Click action edit
    And  Input form employee with new data
    Then Click Save