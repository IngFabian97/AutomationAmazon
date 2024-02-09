@Grid
Feature: Probar diferentes escenarios en una tabla

Rule: El usuario puede devolver valores de la tabla y validarlos.

Background: Navegar a la pagina de la tabla estatica
    Given navego en la tabla estatica

@Smoke @Regression
Scenario: Quiero recuperar el valor de una tabla estatica
    Then puedo devolver el valor que queria

@Regression
Scenario: Quiero validar que la tabla estatica sea visible
    Then puedo validar que la tabla es visible