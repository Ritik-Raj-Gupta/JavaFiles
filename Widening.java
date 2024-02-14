// implicit conversion
class Widening{
	public static void main(String[] ar){ 
		int x=7;
		long y=x;
		float z=y;
		double d=x;
		System.out.println("Int value "+x);
		System.out.println("After conversion, long value "+y);
		System.out.println("After conversion, float value "+z);
		System.out.println("After conversion <Int to Double> , double value "+d);
	}
}
