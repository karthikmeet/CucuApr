Feature: datatablesamples feature

  Scenario: datatablescenarios
    Given I want to write a step with precondition
      | Username  | Password |
      | Kugan     | kx       |
      | Vignesh   | vx       |
      | Saravanan | sx       |
    When I complete action
    Then I validate the outcomesdatatable
