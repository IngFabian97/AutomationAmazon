Feature: Probar la búsqueda en Google

@Google
Scenario: Busco algo en Googleude
    Given  Navego en Google
    When busco algo
    And clic en el boton de busqueda
    Then obtengo resultados


Scenario: Quiero recuperar el valor de una tabla estatica
    Given navego en la tabla estatica
    Then puedo devolver el valor que queria