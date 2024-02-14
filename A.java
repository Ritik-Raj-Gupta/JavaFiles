class A{
	/*static int b=20; //Static variable
	int c=30; //Instance variable
	public static void main(String srgs[]){
		int a=10; //Local variable
		A ref=new A();
		System.out.println(a);;
		System.out.println(A.b);
		System.out.println(ref.c);
	}*/
	static int a=10;
	void fun(){
		int b=10;
		System.out.println(a+" "+b);
		++a; ++b;
	}
	public static void main(String srgs[]){
		A r=new A();
		r.fun();
		r.fun();
	}
}