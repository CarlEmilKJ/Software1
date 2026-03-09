package marriageAgencyTests;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import marriageAgency.MarriageAgency;
import marriageAgency.Customer;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class findMatchesSteps {

    MarriageAgency marriageAgency = new MarriageAgency();
    ArrayList<Customer> matches = new ArrayList<Customer>();

    @Given("a marriage agency with a customer of age {int}")
    public void givenAMarriageAgencyWithACustomer(Integer age){
        marriageAgency.addCustomer(new Customer(age));
    }

    @When("a match for a customer with age {int} is searched")
    public void aMatchForACustomerWithAgeIsSearched(Integer age){
        Customer customer = new Customer(age);
        matches = marriageAgency.findMatches(customer);
    }

    @Then("the customer with age {int} is found")
    public void theCustomerIsFound(int age){
        assertEquals(age, matches.get(0).getAge());
    }

    @Then("no matches are found")
    public void noMatchesAreFound(){
        assertEquals(0,matches.size());
    }
}