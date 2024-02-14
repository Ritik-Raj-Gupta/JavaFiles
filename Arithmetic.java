import java.util.Scanner;
class Arithmetic{
	public static void main(String[] args){
		//int a=Integer.parseInt(args[0]);
		//int b=Integer.parseInt(args[1]);
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		int a=ip.nextInt(); 
		int b=ip.nextInt();
		System.out.println("Addition: "+(a+b));
		System.out.println("Subtraction: "+(a-b));
		System.out.println("Division: "+(a/b));
		System.out.println("Multiplication: "+(a*b));
		System.out.println("Modulus: "+(a%b));
	}
}