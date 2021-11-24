import java.util.Scanner;
class area_of_circle

{
	public static void main(String args[])
	{
		float radius,area;
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the radius of circle:");
		radius = sc.nextFloat();

		area = (22*radius*radius)/7;

		System.out.println("area of circle is:"+area);
	}
}

