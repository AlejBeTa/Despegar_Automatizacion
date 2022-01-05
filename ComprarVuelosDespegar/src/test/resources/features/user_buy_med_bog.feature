Feature: As a user i want to buy a flight from Medellin to Bogota

  @BuyFlight
  Scenario Outline: buy a flight
    Given that the user enter to the page
    And type all the data
      | from   | to   | goDate   | backDate   |
      | <from> | <to> | <goDate> | <backDate> |
    When the user search flight
    And select the first result
    Then he should see <message>
    Examples:
    | from                           | to                            | goDate    | backDate  | message                                              |
    | Medellín, Antioquia, Colombia  | Bogotá, Bogotá D.C., Colombia | febrero 4 | febrero 5 | ¡Falta poco! Completa tus datos y finaliza tu compra |
