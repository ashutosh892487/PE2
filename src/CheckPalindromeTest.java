import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckPalindromeTest {
    CheckPalindrome Checkpalindrome;

    @Before
    public void setup() {
        Checkpalindrome = new CheckPalindrome();

    }

    @After
    public void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        Checkpalindrome = null;

    }

    @Test
    public void ckeckreversestringPass() {

        assertEquals(new String("abcdcba"), Checkpalindrome.Checkpal("abcdcba"));

    }

    @Test
    public void ckeckreversestringFailure() {
        assertNull(Checkpalindrome.Checkpal("fdsgfdshgds"));
    }
}