package com.assigmnemt4;

import java.math.BigDecimal;

public class ProfitCalculatorRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProfitCalculator calculator = new ProfitCalculator("6000", "3000");
		BigDecimal result = calculator.calculateResult();
		System.out.println(result);
	}

}
