package com.epam.healenium.selenide.search.locators;

import com.epam.healenium.selenide.search.SelenideStrategy;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SelenideLinkTextStrategy implements SelenideStrategy {
    public SelenideLinkTextStrategy() {
    }

    @Override
    public boolean doAction(String selector) {
        return $(By.linkText(selector)).isDisplayed();
    }
}
