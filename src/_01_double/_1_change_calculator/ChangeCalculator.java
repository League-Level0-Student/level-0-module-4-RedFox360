package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		String nickels = JOptionPane.showInputDialog("How many nickels do you have?");
		int nickel = Integer.parseInt(nickels);
		System.out.println(nickel * 5);

		String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
		int dime = Integer.parseInt(dimes);
		System.out.println(dime * 10);

		String quarters = JOptionPane.showInputDialog("How many quarters do you have?");
		int quarter = Integer.parseInt(quarters);
		System.out.println(quarter * 25);
		double total = quarter * 25 + dime * 10 + nickel * 5;
		double dollartotal = total / 100;
		// Calculate how much money the user has. Hint: Use a double variable
		JOptionPane.showMessageDialog(null, "In total, you have $" + dollartotal + "");
		// Tell the user how much money they have in dollars and cents format (e.g.
		// $6.75)

	}

}