@smoke
Feature: F04_Search | users could search using product name or sku
  Scenario Outline: user could search using product name
    When : search using the "<productname>"
    Then : the results will appear successfully using the "<productname>"

    Examples:
      | productname |
      | laptop      |
      | book        |
      | nike        |
