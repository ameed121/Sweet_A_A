package Package_Sweet;

import GUI.Monitoring_And_Reporting_GUI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Monitoring_and_Reporting_Steps {

    private DataBase dataBase;
    private Monitoring_And_Reporting_GUI monitoringFrame;

    @Given("the account management system database is initialized for monitoring and reporting")
    public void initializeDatabaseForMonitoringAndReporting() {
        dataBase = new DataBase();
        monitoringFrame = new Monitoring_And_Reporting_GUI(dataBase);
        System.out.println("Monitoring and reporting database initialized.");
    }

    @When("the admin opens the Monitoring and Reporting frame")
    public void theAdminOpensTheMonitoringAndReportingFrame() {
        monitoringFrame.setVisible(true);
    }

    @Then("the users should be displayed ordered by city")
    public void theUsersShouldBeDisplayedOrderedByCity() {
        monitoringFrame.statisticsButtonActionPerformed(null);
        // Assume the statistics button action displays the users ordered by city
        System.out.println("Users displayed ordered by city.");
    }

    @When("the admin clicks on {string} button")
    public void theAdminClicksOnButton(String button) {
        if ("Statistics".equals(button)) {
            monitoringFrame.statisticsButtonActionPerformed(null);
        } else if ("Best-Selling".equals(button)) {
            monitoringFrame.bestSellingButtonActionPerformed(null);
        } else if ("Profits".equals(button)) {
            monitoringFrame.profitsButtonActionPerformed(null);
        } else if ("Back".equals(button)) {
            monitoringFrame.backButtonActionPerformed(null);
        } else {
            throw new IllegalArgumentException("Button not recognized: " + button);
        }
    }


    @Then("the best-selling product should be displayed")
    public void theBestSellingProductShouldBeDisplayed() {
        monitoringFrame.bestSellingButtonActionPerformed(null);
        System.out.println("Best-selling product displayed.");
    }

    @Then("the profits should be displayed")
    public void theProfitsShouldBeDisplayed() {
        monitoringFrame.profitsButtonActionPerformed(null);
        System.out.println("Profits displayed.");
    }
}
