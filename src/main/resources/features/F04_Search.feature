@smoke
Feature: F04_Search | users could search using product name or sku
  Scenario Outline: user could search using product name
    When : search using the "<productname>"
    Then : the results will appear successfully using the "<productname>"

    Examples:
      | productname |
      | laptop      |
      | nike        |

  Scenario Outline: user could search for product using sku
    When : search using thee "<productsku>"
    Then : the results will appear successfullyy using the "<productsku>"

    Examples:
      | productsku |
      | SCI_FAITH  |
      | APPLE_CAM  |
      | SF_PRO_11  |
