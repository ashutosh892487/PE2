import java.io.*;
import java.util.*;
class Member {
     String Members_Name = "";
     int Members_Age;
     double Members_Salary;

    public static void main(String args[])
    {
        MemberVariable object=new MemberVariable();
        object.display();
    }
}
class MemberVariable extends Member{
    public MemberVariable() {
        Members_Name = "Harry Potter";
        Members_Age = 30;
        Members_Salary = 2500.3;
    }
    public void  display()
    {
        System.out.println("Members name: "  + Members_Name);
        System.out.println("Members age: "  + Members_Age);
        System.out.println("Members salary: "  + Members_Salary);
    }
}

