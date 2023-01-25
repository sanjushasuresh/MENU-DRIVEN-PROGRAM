import java.util.Scanner;
public class Menu
{
  public static void main(String args[ ])
  {
    int ch,n;
    System.out.println("Choose an option: 1)Fibonacci series 2)Factorial of number");
    Scanner sc=new Scanner(System.in);
    ch=sc.nextInt();
    System.out.println("Enter the value");
    n=sc.nextInt();
    switch(ch)
    {
      case 1: System.out.println("Fibonacci series is  ");
      for(int i=0;i<=n;i++)
      {
        System.out.println(fib(i));
      }
      break;
      case 2: System.out.println("Factorial of number is " +fact(n));
      break;
      default: System.out.println("Wrong choice");
    }
  }
  static int fact(int n)
  {
    if(n==1||n==0)
       return 1;
    else
       return(n*fact(n-1));
  }
  static int fib(int n)
  {
    if(n==0||n==1)
       return n;
    else
       return(fib(n-1)+fib(n-2));
  }
}