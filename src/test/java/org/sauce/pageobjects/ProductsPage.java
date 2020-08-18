package org.sauce.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class ProductsPage extends BasePage{

    private By dropdown = By.className("product_sort_container");

    private By products = By.className("inventory_list");

    private By cartButton = By.className("shopping_cart_link");


    public void sortProducts(String option) {
        selectFromDropDown(dropdown,option);
    }

    public boolean isProductsSortedHiToLow() {
        List<WebElement> price = driver.findElements(By.cssSelector(".inventory_item_price"));

        List<String> sortedPrice = price.stream().map(WebElement::getText).collect(Collectors.toList());

        return sortedPrice.get(0).equals("$49.99") && sortedPrice.get(sortedPrice.size() - 1).equals("$7.99");
    }

    public void addProducts() {
        if(isProductsSortedHiToLow()) {
            List<WebElement> addProductButton = driver.findElements(By.cssSelector(".btn_inventory"));
            clickOnButton(addProductButton.get(0));
            clickOnButton(addProductButton.get(addProductButton.size()-1));
            clickOnButton(cartButton);
        } else {
            throw new RuntimeException("Products are not sorted by High to Low price");
        }
    }
}
