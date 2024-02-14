// Unboxing-> Wrapper class object to primitive datatype
// Syntax: int i = obj.intValue();
class WrapperClassUnboxing{
	public static void main(String ar[]){
		Integer iobj=new Integer(100);
		int i=iobj; // AutoUnboxing
		int j=iobj.intValue();
		System.out.println(i);
		System.out.println(i+j);
	}
}