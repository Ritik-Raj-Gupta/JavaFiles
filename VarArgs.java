/*class A{
	void add(int... a){
		int sum=0;
		for(int x:a){
			sum+=x;
		}
		System.out.println("Sum of numbers: "+sum);
	}
}*/
class vars{
	public void display(int num, String... str){
		System.out.println("Number is: "+num);
		for(String i:str)
			System.out.println(i);
	}
}
class VarArgs{
	public static void main(String args[]){
		/*A r=new A();
		r.add();
		r.add(10); 
		r.add(10,20); 
		r.add(10,20,30); 
		r.add(10,20,30,40);
		r.add(10,20,30,40,50);
		r.add(10,20,30,40,50,60);
		r.add(10,20,30,40,50,60,70);*/
		vars obj=new vars();
		obj.display(10,"hi","hello","me","you");
		obj.display(10,"hi","hello","me");
		obj.display(10,"hi","hello");
	}
}