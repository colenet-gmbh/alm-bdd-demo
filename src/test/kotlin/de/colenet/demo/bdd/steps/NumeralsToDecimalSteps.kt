package de.colenet.demo.bdd.steps

import de.colenet.demo.bdd.NumeralsConverter
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull

internal class NumeralsToDecimalSteps {

    private lateinit var romanNumber: String
    private var decimalNumber: Int? = null

    private val numeralsConverter = NumeralsConverter()

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
