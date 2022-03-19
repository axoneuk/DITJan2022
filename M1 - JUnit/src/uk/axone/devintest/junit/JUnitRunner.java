package uk.axone.devintest.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        SimpleJunitDemo.class,
        AppUtils_Test.class,
        JUnitFunctionalTests.class
})

public class JUnitRunner {

}