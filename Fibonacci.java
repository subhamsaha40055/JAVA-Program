import java.io.*;
import java.util.*;
class F
{
    int n,s,a,b,c,sum,f,j,k ;
    F()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value for how many terms for fibonacci series :");
        n=sc.nextInt();
        System.out.print("\nEnter first number : ");
        a=sc.nextInt();
        System.out.print("Enter Second number : ");
        b=sc.nextInt();
        j=a;
        k=b;
        s=0;
        //c=0;
        System.out.print("\nYour fibonacci series :"+j+","+k+",");
        while(n!=0)
        {
            f=a+b;
            a=b;
            b=f;
            //c++;
            System.out.print(+f+",");
            s=s+f;
            n--;
        }
        sum=(s+j+k);
        System.out.print("\nSum :  "+sum);
    }

}
class Fibonacci
{
    public static void main(String args[])
    {
        F obj=new F();
    }
}