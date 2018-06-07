package testRunnerB;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//@RunWith() annotation tells about the test runner class to start executing our tests.
//@CucmberOptions() annotation is used to set some properties for our cucumber test like feature file, step definition, etc. 

/*Features: Features Options helps Cucumber to locate the Feature file in the project folder structure.All we need to do is 
to specify the folder path and Cucumber will automatically find all the ‘.features‘ extension files in the folder.*/

/*Glue: It is almost the same think as Features Option but the only difference is that it helps Cucumber to locate the 
Step Definition file. Whenever Cucumber encounters a Step, it looks for a Step Definition inside all the files present
in the folder mentioned in Glue Option.*/



@RunWith(Cucumber.class)
@CucumberOptions(features="Feature",glue={"stepDefinitionB"},tags={"@CucumberB"})
		
public class TestBRunnerB 
{	
	//Let it be empty  
}


