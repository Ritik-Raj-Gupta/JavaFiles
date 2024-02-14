// for precision of decimal digits
import java.math.BigDecimal;
public class bigDecimal{
	public static void main(String[] ar){
		/*
		Double a=1.5;
		Double b=1.50;
		System.out.println(a.equals(b));
		BigDecimal x=new BigDecimal("1.5");
		BigDecimal y=new BigDecimal("1.50");
		System.out.println(x.equals(y));
		*/
		BigDecimal x=new BigDecimal("1234567890.0987654321");
		BigDecimal y=new BigDecimal("987654321.123456789");
		//Addition
		x=x.add(y);
		System.out.println("Addition: "+x);
		//Subtraction
		x=x.subtract(y);
		System.out.println("Subtraction: "+x);
		//Multiplication
		x=x.multiply(y);
		System.out.println("Multiplication: "+x);
		//Division
		x=x.divide(y);
		System.out.println("Division: "+x);
	}
}