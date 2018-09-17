import java.lang.*;
import java.io.*;
import java.util.*;
public class CheckPalindrome {


    public String Checkpal(String InputString)
    {
        String str = InputString;
        StringBuilder sb = new StringBuilder();

        for(int i = str.length() - 1; i >= 0; i--)
        {
            sb.append(str.charAt(i));
        }

        String result=sb.toString();
        if(result.equals(str))
            return InputString;
        else {
            return null;
        }
    }
}
