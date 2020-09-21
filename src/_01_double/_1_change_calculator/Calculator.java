package _01_double._1_change_calculator;

import javax.swing.JOptionPane;
import java.lang.Math;

@SuppressWarnings("unused")
public class Calculator {



	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Welcome to the calculator!");
		String number1string = JOptionPane.showInputDialog("Type in a number");
		String number2string = JOptionPane.showInputDialog("Type in another number");
		double number1 = Double.parseDouble(number1string);
		double number2 = Double.parseDouble(number2string);
		double subtracted = number1-number2;
		double exponents = Math.pow(number1, number2);
		double added = number1+number2;
		double divided = number1/number2;
		double multiplied = number1*number2;
		double sqrt1 = Math.sqrt(number1);
		double sqrt2 = Math.sqrt(number2);
	
		
		String[] options = {"×", "÷", "+", "-", "^", "sqrt"};
		int numberop = JOptionPane.showOptionDialog(null, "Choose an operation",
		"Choose an operation",
		JOptionPane.INFORMATION_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, options, null);
		if(numberop==0)	{
			JOptionPane.showMessageDialog(null, "The answer is " + multiplied  + "");
		}
		if(numberop==1)	{
			if(number2==0)	{
				JOptionPane.showMessageDialog(null, "The answer is undefined");
			}
			else	{
				JOptionPane.showMessageDialog(null, "The answer is " + divided + "");
			}
		}
		if(numberop==2) {
			JOptionPane.showMessageDialog(null, "The answer is " + added + "");
		}
		if(numberop==3)	{
			JOptionPane.showMessageDialog(null, "The answer is " + subtracted + "");
		}
		if(numberop==4)	{
			JOptionPane.showMessageDialog(null, "The answer is " + exponents + "");
		}
		if(numberop==5) {
			JOptionPane.showMessageDialog(null, "The square root of your first number is " + sqrt1 + ". The square root of your second number is " + sqrt2 + ".");
		}
		
		
	}
	

}
