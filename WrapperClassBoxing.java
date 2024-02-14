// Boxing-> Primitive datatype to its wrapper class
// Syntax: Integer obj=Integer.valueOf(i);
class WrapperClassBoxing{
	public static void main(String ar[]){
		int i=100;
		Integer iobj=Integer.valueOf(i);
		Integer iobj2=i; // Autoboxing
		System.out.println(iobj);
		System.out.println(iobj+iobj2);
	}
}
