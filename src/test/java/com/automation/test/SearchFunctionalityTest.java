package com.automation.test;

import com.automation.catagories.SmokeTest;
import com.automation.test.BaseTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class SearchFunctionalityTest extends BaseTest {
@Test
@Category(SmokeTest.class)
    public void verifySearchResultsAreDisplayed(){
    System.out.println("verify search result");
}
@Test
    public void verifyMessageWhenThereAreNoResults(){
    System.out.println("verify no results message");
}

@Test
    public void verifySearchResultHasSearchKeyword(){
    System.out.println("verify search result has search keyword");
}
}
