Feature: Busqueda en e sitio de googmatLine

Background: Navegacion al sitio de google
    Given Como usuario navego al sitio de google


    Scenario: Busqueda de la palabra pinguino en el boton de buscar
    When como usuario busco la palabra pinguino
    And Como usuario doy click en el boton buscar
    Then Espero que se visualice el elemento con el texto 10 razones genial para celebrar a los pingüinos

    Scenario: Busqueda de la palabra ping Pong
    When Como usuario busco la palabra ping pong
    And Como usuario le doy Enter


    Scenario: Busqueda de la palabra facebook
    When Como usuario busco la palabra Facebook
    And Como usuario le doy Enter1


    Scenario: Busqueda de la palabra instagram
    When Como usuario busco la palabra Instagram
    And Como usuario le doy Enter2

    Scenario: Busqueda de la palabra banco General
    When Como usuario busco la palabra Banco General
    And Como usuario le doy Enter3

    Scenario: Busqueda de la palabra Amor
    When Como usuario busco la palabra Amor
    And Como usuario le doy Enter4