package pages;

public class AmazonPage extends BasePage{

    private String searchAmazon = "//input[@id='twotabsearchtextbox']";
    private String searchButton = "//input[@id='nav-search-submit-button']";
    private String nextPage = "//a[normalize-space()='2']";
    private String thirdItemPage2 = "//div[4]//div[1]//div[1]//span[1]//div[1]//div[1]//div[1]//div[2]//div[1]//div[1]//div[1]//h2[1]//a[1]//span[1]";
    private String addToCart = "//input[@id='add-to-cart-button']";
    private String messageAddToCart = "(//span[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold'])[1]";


    public AmazonPage(){
        super(driver);
    }

    public void navigateToAmazon(){
        navigateTo("https://www.amazon.com/");
    }

    public void enterSearchCriteria(String criteria){
        write(searchAmazon,criteria);
 
    }

    public void clickSearchButton(){
        clickElement(searchButton);
    }

    public void clickNextPage(){
    
        clickElement(nextPage);
    }

    public void selectThirtItem(){
        clickElement(thirdItemPage2);
    }

    public void clickAddToCart(){
        clickElement(addToCart);
    }

    public String assertItem(){
        return textFromElement(messageAddToCart);

    }


}
