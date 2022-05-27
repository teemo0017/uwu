@Table
Feature: Busco una ciudad de aceurdo al estado que pertenece
Scenario: Testear si al escribir un estado se encuentra
    Given Como usuario navego al sitio web de la lista
    When Como usuario busco un estado en la lista
    Then Como usuario encuentro una ciudad de la lista