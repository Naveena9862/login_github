package login;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags={"@tag1"},plugin={"json:target/Report/reports3.json"})
public class Runner_login
{

}
