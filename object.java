class A{
	void display(int a){
		System.out.println("Number is: "+a);
	}
}

class object{
	public static void main(String args[]){
		A obj=new A();
		obj.display(10);
		obj.display(20);
	}
}