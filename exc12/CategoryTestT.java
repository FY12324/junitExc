package exc12;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@ExcludeCategory(ClassifyTTests.class)
@SuiteClasses({ AssertThat2Test.class, CategoryTestO.class })
public class CategoryTestT {

}
