package lukaszkutylowski.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalcService {
	
	public BigDecimal executeCalculation(BigDecimal num1, BigDecimal num2, String sign) {
		BigDecimal result = null;
		
		if (sign.equals("+")) {
			result = add(num1, num2);
		} else if (sign.equals("-")) {
			result = subtract(num1, num2);
		} else if (sign.equals("/")) {
			result = divide(num1, num2);
		} else if (sign.equals("*")) { 
			result = multiply(num1, num2);
		}
		
		return result;
	}

	private BigDecimal add(BigDecimal num1, BigDecimal num2) {
		return num1.add(num2);
	}
	
	private BigDecimal subtract(BigDecimal num1, BigDecimal num2) {
		return num1.subtract(num2);
	}
	
	private BigDecimal divide(BigDecimal num1, BigDecimal num2) {
		return num1.divide(num2, 10, RoundingMode.CEILING);
	}
	
	private BigDecimal multiply(BigDecimal num1, BigDecimal num2) {
		return num1.multiply(num2);
	}

}
