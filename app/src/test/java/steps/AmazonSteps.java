package steps;

import io.cucumber.java.en.*;
import pages.AmazonPage;
import org.junit.Assert;

public class AmazonSteps {

    AmazonPage amazon = new AmazonPage();

    @Given("^the user navigate tp www.amazon.com$")
    public void navigateAmazon(){
        amazon.navigateToAmazon();
    }

    @When("^searches for (.+)$")
    public void enterSearch(String Criteria){
        amazon.enterSearchCriteria(Criteria);
        amazon.clickSearchButton();
    }


    @And("^navigates to the second page$")
    public void clickPage2(){
        amazon.clickNextPage();
    }

    @And("^navigates to the third item$")
    public void click3Item(){
        amazon.selectThirtItem();
    }

    @Then("^assert that the item would be available for purchase$")
    public void assertItem3(){
        amazon.clickAddToCart();
        Assert.assertEquals("Added to Cart", amazon.assertItem());
    }
    
}
