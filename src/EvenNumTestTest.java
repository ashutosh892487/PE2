import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTestTest {
    EvenNumTest evennumbertest;

    @Before
    public void setUp() throws Exception {
        evennumbertest=new EvenNumTest();
    }

    @After
    public void tearDown() throws Exception {
        evennumbertest=null;
    }

    @Test
    public void eventestsuccess(){
        boolean result=evennumbertest.isEven(22);
        //Assert
        assertTrue(result);
    }

    @Test
    public void eventestfailure(){
        boolean result=evennumbertest.isEven(43);
        //Assert
        assertFalse(result);
    }
}