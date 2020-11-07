package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "rerun:target/rerun.txt"
        },

        features = "src/test/resources/features",
        glue = {"com/vytrack/step_definitions"},
        dryRun = false,
        publish = true,

        //This is used to determine which tests cucumber would only run
        tags = "@s_o"
)
public class CucumberRunner {
}
