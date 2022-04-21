package d0414;

import java.util.Scanner;

public class MinusCalculator extends PlusCalculator{
	public int calculate() {
		return this.value1 - this.value2;
	}
	
	/*
	public void showResult(int result) {
		System.out.printf("%d - %d = %d",this.value1,this.value2,result);
	}
	*/
	
	public String getOperator() {
		return "-";
	}
	
	
	public static void main(String[] args) {
		MinusCalculator calculator = new MinusCalculator();
		calculator.execute();
	}
	
}
