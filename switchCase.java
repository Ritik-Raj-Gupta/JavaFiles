import java.util.Scanner;
public class switchCase{
	public static void main(String[] ar){
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter number 1: ");
		int a=ip.nextInt();
		System.out.print("Enter number 2: ");
		int b=ip.nextInt();
		System.out.print("Enter choice: ");
		int ch=ip.nextInt();
		switch(ch){
			case 1:
				System.out.println("Sum: "+(a+b));
				break;
			case 2:
				System.out.println("Difference: "+(a-b));
				break;
			case 3:
				System.out.println("Product: "+(a*b));
				break;
			case 4:
				System.out.println("Division: "+(a/b));
				break;
			default:
				System.out.println("Invalid choice!");
		}
	}
}