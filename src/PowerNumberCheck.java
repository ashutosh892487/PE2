import java.lang.*;
import java.io.*;
import java.util.*;

import static java.lang.Math.log;

public class PowerNumberCheck {
    public String CheckNumber( double Input ){
        String Result="";
        double quotient=log((int)Input)/log(4.0);
        if (quotient == (int)quotient)
        {
            Result= "True";
        }
       /*if(Input==1 || Input==4)
        {
            Result= "True";
        }
        else if(Input>1)
        {
            float quotient=Input/4;

            if(quotient%4==0)
            {
                Result= "True";
            }
            else {
                Result="False";
                System.out.println("Quotient"+quotient);
                System.out.println("Result"+Result);
            }

        }*/
        else
        {
            Result= "False";
        }
        return Result;
    }
}
