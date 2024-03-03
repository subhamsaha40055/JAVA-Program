import java.io.*;
import java.util.*;
class Number
{
    int s,r,k;
    void fn(int p)
    {
        k=p;
        s=0;
        while(p!=0)
        {
          r=p%10;
          s=s*10+r;
          p=p/10;
        }
    }
    void fn()
    {
        if(k==s)
        System.out.println(s+" is palindrome");
        else
        System.out.print(s+" is not palindrome");
    }
}
class PalindromeNumber
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number to check palindrome or not:");
        n=sc.nextInt();
        Number obj = new Number();
        obj.fn(n);
        obj.fn();

    }
}
