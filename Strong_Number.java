import java.io.*;
import java.util.*;
class strong
{
    Scanner sc=new Scanner(System.in);
    int factorial(int n)
    {
        int i;
        int fact=1;
        for(i=n;i>=1;i--)
        {
            fact=fact*i;
        }
        return fact;
    }
    int check_strong_number(int num)
    {
        int copy=num;
        int rem,check=0,flag=0;
        while(copy!=0)
        {
            rem=copy%10;
            check=factorial(rem)+check;
            copy=copy/10;
        }
        if(num==check)
        {
            flag=1;
        }
        return flag;
    }
}
class Strong_Number
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        strong obj=new strong();
        int n;
        System.out.println("Enter a number to check it's strong or not:");
        n=sc.nextInt();
        int scan=obj.check_strong_number(n);
        if(scan==1)
        {
            System.out.println("The given Number "+n+" is a Strong number.");
        }
        else
        {
            System.out.println("The given Number "+n+" is not a Strong number.");
        }
    }

}