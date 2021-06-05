package ro.ase.cts.unittesting.suites;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.*;
import ro.ase.cts.unittesting.categories.TesteRight;
import ro.ase.cts.unittesting.categories.TesteUrgente;

@RunWith(Categories.class)
@SuiteClasses(CompleteTestSuite.class) //nerecomandat
@Categories.IncludeCategory({TesteUrgente.class})
@Categories.ExcludeCategory({TesteRight.class})
public class CustomTestSuite {
}
