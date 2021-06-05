package ro.ase.cts.unittesting.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ro.ase.cts.unittesting.tests.GrupaTest;
import ro.ase.cts.unittesting.tests.GrupaTestWithFakes;
import ro.ase.cts.unittesting.tests.GrupaTestWithMocks;
import ro.ase.cts.unittesting.tests.GrupaTestWithStubs;

@RunWith(Suite.class)
@Suite.SuiteClasses({GrupaTest.class, GrupaTestWithFakes.class, GrupaTestWithStubs.class, GrupaTestWithMocks.class})
public class CompleteTestSuite {


}
