Feature: FB login page multiple test

  Scenario Outline: Login scenario multiple
    Given launch the application
    When user enter the username as "<arg1>" and password as "<arg2>"
    But a supporting statement one
    And a supporting statement two
    Then I validate the outcomes

    Examples: 
      | arg1        | arg2 |
      | Kirthika    | xxxx |
      | Balachander | bbbb |
