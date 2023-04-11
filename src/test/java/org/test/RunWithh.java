package org.test;



import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({A.class,B.class,C.class
	})
public class RunWithh {
	


//
// @Test
// public void result() {
//	Result r = JUnitCore.runClasses(A.class,B.class,C.class);
//	System.out.println(r.getRunCount());
//	System.out.println(r.getFailureCount());
//	
//	System.out.println(r.getIgnoreCount());
//	System.out.println(r.getRunTime());
//	
//
// }
}









