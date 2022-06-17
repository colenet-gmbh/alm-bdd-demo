package de.colenet.demo.bdd.steps

import NumeralsConverter
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull

internal class NumeralsStep {

    private lateinit var romanNumber: String
    // lateinit does not work with primitive types
    private var decimalNumber: Int? = null

    private val numeralsConverter: NumeralsConverter = NumeralsConverter()

    @Given("The roman numeral {string}")
    fun `Given the roman numeral`(roman: String) {
        romanNumber = roman
    }

    @When("Converted to decimal number")
    fun `When converted to decimal number`() {
        decimalNumber = numeralsConverter.convert(romanNumber)
    }

    @Then("The output should equal {int}")
    fun `Then the output should equal`(exp: Int) {
        assertNotNull(decimalNumber)
        assertEquals(exp, decimalNumber)
    }
}
