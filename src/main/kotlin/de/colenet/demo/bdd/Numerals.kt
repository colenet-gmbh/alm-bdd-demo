package de.colenet.demo.bdd

class NumeralsConverter {

    private val romansToDecimals = mapOf(
        "I" to 1,
        "II" to 2,
        "III" to 3,
        "IV" to 4,
        "V" to 5,
        "X" to 10
    )

    fun convert(romanNumeral: String): Int? = romansToDecimals[romanNumeral]
}
