Feature: Roman Numerals to decimal

  Converts roman numerals to decimal numbers

  Scenario: Converting "II" into 2
    Given The roman numeral "II"
    When Converted to decimal number
    Then The output should equal 2

  @converting
  Scenario Outline: Converting multiple roman numerals into decimal
      Given The roman numeral <roman>
      When Converted to decimal number
      Then The output should equal <decimal>

      Examples:
         | roman | decimal |
         | "I"   | 1       |
         | "IV"  | 4       |
         | "V"   | 5       |
         | "X"   | 10      |
