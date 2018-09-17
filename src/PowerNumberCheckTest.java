import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerNumberCheckTest {
    PowerNumberCheck Powernumbercheck;
        @Before
        public void setup() {
            Powernumbercheck = new PowerNumberCheck();

        }

        @After
        public void teardown() {
            // This method runs, after running all the test cases
            // This method is used to clear the initialized variables
            Powernumbercheck = null;

        }

        @Test
        public void ckecknumberpowerof4Pass() {

            assertEquals(new String("True"), Powernumbercheck.CheckNumber(16));

        }

        @Test
        public void ckecknumberpowerof4Failure() {

            assertEquals(new String("False"), Powernumbercheck.CheckNumber(65));

        }
    @Test
    public void ckecknumberpowerof4Failure2() {

        assertEquals(new String("False"), Powernumbercheck.CheckNumber(-9));

    }
    }