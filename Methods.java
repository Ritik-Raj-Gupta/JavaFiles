// static method called with name of class not object of class
class Methods{
	public static void add(){
		int a=10;
		int b=20;
		System.out.println("Sum: "+(a+b));
	}
	public static void main(String args[]){
		Methods obj=new Methods();
		obj.display();
		Methods.add();
	}
	void display(){
		System.out.println("Learn Methods!");
	}
}