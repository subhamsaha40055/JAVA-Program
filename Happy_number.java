import java.io.*;
import java.util.*;
class H_n
{
    Scanner sc= new Scanner(System.in);
    int n,s,r,p;
    void input()
    { 
        
        System.out.print("Enter number for cheek happy or not : ");
        n=sc.nextInt();
    }
    void calculate()
    {
        p=n;
        while(n!=1 && n!=4)
        {
            s=0;
            while(n!=0)
            {
                r=n%10;
                s=(r*r)+s;
                n=n/10;
            }
            n=s;
        }
    }
    void display()
    {
        if(s==1)
        {
            System.out.print("\nGiven number "+p+" is happy number.");
        }
        else
        {
            System.out.print("\nGiven number "+p+" not happy number.");
        }
    }
}
class Happy_number
{
    public static void main(String[] args) 
    {
        H_n obj=new H_n();
        obj.input();
        obj.calculate();
        obj.display();
    }   
}