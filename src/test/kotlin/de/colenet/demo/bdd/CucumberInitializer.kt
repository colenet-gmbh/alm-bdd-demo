package de.colenet.demo.bdd

import io.cucumber.core.options.Constants.GLUE_PROPERTY_NAME
import org.junit.platform.suite.api.ConfigurationParameter
import org.junit.platform.suite.api.IncludeEngines
import org.junit.platform.suite.api.SelectClasspathResource
import org.junit.platform.suite.api.Suite

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("steps")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "de.colenet.demo.bdd")
class CucumberInitializer
