package exc12;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@IncludeCategory(ClassifyOTests.class)
@SuiteClasses({ AssertThat2Test.class })
public class CategoryTestO {

}
