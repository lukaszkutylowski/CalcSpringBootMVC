package lukaszkutylowski.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.springframework.stereotype.Service;

@Service
public class CalcService {
	
	public boolean isZero(String sign, BigDecimal num2) {
		return (sign.equals("/") && num2.equals(new BigDecimal("0")));
	}
	
	public boolean invalidOperator(String sign) {
		return !(sign.equals("+") || sign.equals("-") || sign.equals("*") || sign.equals("/"));
	}
	
	public BigDecimal executeCalculation(BigDecimal num1, BigDecimal num2, String sign) {
		BigDecimal result = null;
		
		switch (sign) {
		case "+":
			result = add(num1, num2);
			break;
		case "-":
			result = subtract(num1, num2);
			break;
		case "/":
			result = divide(num1, num2);
			break;
		case "*":
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
