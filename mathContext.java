// MathContext class used for controlling precision of bigdecimal objects
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
public class mathContext{
	public static void main(String[] ar){
		//MathContext m1=new MathContext(4,RoundingMode.HALF_UP);
		MathContext m1=new MathContext(5,RoundingMode.HALF_DOWN);
		BigDecimal x=new BigDecimal("123.45678",m1);
		BigDecimal y=new BigDecimal("34.5678",m1);
		System.out.println("BigDecimal 1: "+x);
		System.out.println("BigDecimal 2: "+y);
		BigDecimal res=x.add(y,m1);
		System.out.println("Result: "+res);
	}
}