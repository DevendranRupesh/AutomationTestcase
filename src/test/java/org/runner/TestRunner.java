package org.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/Feature/Testcase1.feature"},
        //features = {"src/test/Feature"},
        dryRun = !true,
        glue = {"org.Steptestcase","org.Hooks"},
        monochrome = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
       //tags = "@smoke",
        plugin = {
                "pretty", "html:target/cucumber.html",
                "json:target/cucumber.json",
                "junit:target/cucumber.xml"

        }
)
public class TestRunner {
}
