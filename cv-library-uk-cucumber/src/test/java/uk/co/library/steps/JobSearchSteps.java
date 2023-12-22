package uk.co.library.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import uk.co.library.pages.HomePage;

import java.util.List;

public class JobSearchSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {

    }

    @When("I enter JobTitle {string}")
    public void iEnterJobTitle(String title) {
        new HomePage().enterJobTitle(title);
    }

    @Then("I enter Location {string}")
    public void iEnterLocation(String jobLocation) {
        new HomePage().enterLocation(jobLocation);
    }

    @And("I select Distance {string}")
    public void iSelectDistance(String jobDistance) {
        new HomePage().selectDistance(jobDistance);
    }

    @And("I click on moreSearchOptionsLink")
    public void iClickOnMoreSearchOptionsLink() {
        new HomePage().clickOnMoreSearchOption();
    }

    @And("I enter minimum salary {string}")
    public void iEnterMinimumSalary(String minSalary) {
        new HomePage().enterMinSalary(minSalary);
    }

    @And("I enter maximum salary {string}")
    public void iEnterMaximumSalary(String maxSalary) {
        new HomePage().enterMaxSalary(maxSalary);
    }

    @And("I select salaryType {string}")
    public void iSelectSalaryType(String salaryType) {
        new HomePage().selectSalaryType(salaryType);
    }

    @And("I select JobType {string}")
    public void iSelectJobType(String jobType) {
        new HomePage().selectJobType(jobType);
    }

    @And("I click on Find Jobs button")
    public void iClickOnFindJobsButton() {
        new HomePage().clickOnFindJobsButton();
    }

    @Then("I verify the result {string}")
    public int iVerifyTheResult(String option) {
        switch (option) {
            case "job title":
                return 0;
            case "location":
                return 1;
            case "distance":
                return 2;
            case "salaryMin":
                return 3;
            case "salaryMax":
                return 4;
            case "salaryType":
                return 5;
            case "jobType":
                return 6;
            default:
                return -1;
        }
    }

    public void enterMoreSearchOptions(String option, DataTable dataTable) {
        List<List<String>> data = dataTable.asLists(String.class);

    }

}
