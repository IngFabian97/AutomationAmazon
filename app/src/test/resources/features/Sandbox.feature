Feature: Validar que un texto esté presente dentro de la lista.

@City
Scenario Outline: Quiero validar que un texto esté presente dentro de la lista.
    Given navego en la pagina de la lista
    When busco <state> en la lista
    Then puedo encontrar el texto <city> en la lista

Examples:

| state | city |
| Alabama | Alabama |
| Alaska | Alaska |
| Whashigton | Whashigton |