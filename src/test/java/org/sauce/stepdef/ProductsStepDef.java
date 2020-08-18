package org.sauce.stepdef;

import io.cucumber.java.en.Given;
import org.hamcrest.MatcherAssert;
import org.sauce.pageobjects.BasePage;
import org.sauce.pageobjects.ProductsPage;

public class ProductsStepDef extends BasePage {
    private ProductsPage productsPage = new ProductsPage();

    @Given("I sort the products by {string}")
    public void i_sort_the_products_by(String option) {
        productsPage.sortProducts(option);
        MatcherAssert.assertThat("Products are not sorted as expected", productsPage.isProductsSortedHiToLow());
    }

    @Given("add them to basket")
    public void add_them_to_basket() {
        productsPage.addProducts();
    }
}
