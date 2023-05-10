package com.automation.runner;

import com.automation.catagories.SmokeTest;
import com.automation.test.CartPageTest;
import com.automation.test.LoginTest;
import com.automation.test.SearchFunctionalityTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Suite.SuiteClasses({CartPageTest.class, LoginTest.class, SearchFunctionalityTest.class})
@Categories.IncludeCategory(SmokeTest.class)
public class GroupRunner {
}
