package _99_extra;


import javax.swing.JOptionPane;

public class SimpleCalculator {

	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
String no1 = JOptionPane.showInputDialog("Type in an integer");
String no2 = JOptionPane.showInputDialog("Type in another integer");
int number1 = Integer.parseInt(no1);
int number2 = Integer.parseInt(no2);
int times = number1*number2;
int divide = number1/number2;
int add = number1+number2;
int subtract = number1-number2;

		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
String[] options = {"Multiply", "Divide", "Add", "Subtract",};
int colorop = JOptionPane.showOptionDialog(null, "Choose an operation",
        "Choose an operation",
        JOptionPane.INFORMATION_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, options, null);
if(colorop==0)    {
	JOptionPane.showMessageDialog(null,""+number1+" times "+number2+" equals "+times+"");
}
if(colorop==1)    {
	JOptionPane.showMessageDialog(null,""+number1+" divided by "+number2+" equals "+divide+"");
}
if(colorop==2) {
	JOptionPane.showMessageDialog(null,""+number1+" plus "+number2+" equals "+add+"");
}
if(colorop==3)    {
	JOptionPane.showMessageDialog(null,""+number1+" minus "+number2+" equals "+subtract+"");
}

		

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.

		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }

	// 4. Create similar methods for subtraction, multiplication and division.
}