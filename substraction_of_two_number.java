import java.util.Scanner;
public class substraction_of_two_number
{
    public static void main(String[] args)
    {
        int num1,num2,sum;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the frist numnber:");
        num1=sc.nextInt();
        System.out.print("Enter the second number:");
        num2=sc.nextInt();
        
        sum=num1-num2;
        System.out.println("the substraction is:"+sum);
    }
}