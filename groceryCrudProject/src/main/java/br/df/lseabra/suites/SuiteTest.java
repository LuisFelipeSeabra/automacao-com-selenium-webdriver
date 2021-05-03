package br.df.lseabra.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;
import org.junit.runners.Suite;
import br.df.lseabra.test.ClienteTest;

@RunWith(Suite.class)
@SuiteClasses({
	ClienteTest.class,
})
public class SuiteTest {

}
