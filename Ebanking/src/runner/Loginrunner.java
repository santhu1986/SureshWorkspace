package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="E:\\Seleniumsuresh\\Ebanking\\src\\feature\\Rolecre.feature"
                 ,glue="stepdefination",monochrome=true,
                 plugin={"pretty","json:Target/Role/Roleres.json"})
public class Loginrunner 
{

}
