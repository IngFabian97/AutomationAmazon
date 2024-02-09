#Feature: As a Customer when I search for Alexa, I want to see third option on the second page is available for purchase and can be added to the cart

# Scenario: Buscar producto en Amazon
# Given the user navigate tp www.amazon.com
# When searches for Alexa
# And navigates to the second page
# And navigates to the third item
# Then assert that the item would be available for purchase (the user would be able yo add it to the cart)

@Amazon
Feature: Search Alexa in the Amazon store

Scenario Outline: Rule: As a Customer when I search for Alexa, I want to see third option on the second page is available for purchase and can be added to the cart
    Given the user navigate tp www.amazon.com
    When searches for <product>
    And navigates to the second page
    And navigates to the third item
    Then assert that the item would be available for purchase

    Examples:
        | product |
        | xbox |



    