Feature: As a user i want to buy a flight from Medellin to Bogota

  @BuyFlight
  Scenario Outline: buy a flight
    Given that the user enter to the page
    And type all the data
      | from   | to   | godate   | backdate   |
      | <from> | <to> | <godate> | <backdate> |
    When the user search flight
    And select the first result
    Then he should see <message>
    Examples:
    | from | to  | godate    | backdate  | message                                              |
    | med  | bog | febrero 4 | febrero 5 | ¡Falta poco! Completa tus datos y finaliza tu compra |
