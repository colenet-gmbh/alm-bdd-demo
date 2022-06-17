
Feature: Roman Numerals

  Converts roman numerals to decimal numbers

  Scenario:
    Given The roman numeral "II"
    When Converted to decimal number
    Then The output should equal 2

  @converting
  Scenario Outline: converting
      Given The roman numeral <roman>
      When Converted to decimal number
      Then The output should equal <decimal>

      Examples:
         | roman | decimal |
         | "I"   | 1       |
         | "IV"  | 4       |
         | "V"   | 5       |
         | "X"   | 10      |
