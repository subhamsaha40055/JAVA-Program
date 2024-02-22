import java.io.*;
import java.util.*;
class V_C
{
    int i,count,cons,space;
    char ch;
    String str;
    Scanner sc=new Scanner(System.in);
    void input()
    {
         System.out.println("Enter Any Sentence for count vowels and consonant :");
         str=sc.nextLine();
        
    } 
    void calculate()
    {   count=0;
        cons=0;
        for(i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if((ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U')||(ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
            {
                count=count+1;
            }
            else
            {
                if(ch==' ')
                {
                    space=space+1;
                }
                else
                {
                    cons=cons+1;
                }
            }
        }  
    }
    void display()
    {
       System.out.print("\nVowels are= "+count);
       System.out.print("\nConsonant are= "+cons);
    }
}
class Vowels_Consonant
{
    public static void main(String args[])
    {
        V_C obj=new V_C();
        obj.input();
        obj.calculate();
        obj.display();
    }
}