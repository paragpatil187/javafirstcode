package com.assigmnemt4;

import java.math.BigDecimal;

public class ProfitCalculator {
	 BigDecimal SP;
	 BigDecimal CP;
	public ProfitCalculator(String i, String j) {
		this.SP=new BigDecimal(i);
		this.CP=new BigDecimal(j);
	}
	
	public BigDecimal calculateResult() {
	BigDecimal diff= SP.subtract(CP);
	 BigDecimal result1=diff.divide(CP);
	 BigDecimal multiply = new BigDecimal("100");
	 BigDecimal result=result1.multiply(multiply);
	 return result;
	}

}
