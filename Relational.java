import java.util.Scanner;
class Relational{
	public static void main(String[] args){
		//int a=Integer.parseInt(args[0]);
		//int b=Integer.parseInt(args[1]);
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		int a=ip.nextInt(); 
		int b=ip.nextInt();
		System.out.println("Greater than: "+(a>b));
		System.out.println("Lesser than: "+(a<b));
		System.out.println("Greater than or equal to: "+(a>=b));
		System.out.println("Lesser than or equal to: "+(a<=b));
		System.out.println("Equal to: "+(a==b));
		System.out.println("Not equal to: "+(a!=b));
	}
}