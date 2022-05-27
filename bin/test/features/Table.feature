
Feature: Vamos realizar test a una tabla estatica

    Background: como usuario navego a la pagina web de la tabla
    Given navego al sitio web de la tabla estatica


    Scenario: Validar el valor que retorna la celda fila s columna 2
    Then Retorna el valor de la celda fila 5 columna 2

    Scenario: Validar que la tabla se muestre
    Then Como usuario valido se se muestra la tabla


    Scenario: Modificar el valor para la celda 4, columna 1
    When Como usuario modifico el valor de la celda
    Then Como usuario valido el nuevo valor de la celda
    

