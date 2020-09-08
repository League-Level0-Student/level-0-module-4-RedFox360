package _02_boolean._1_sleepy_head;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class SleepyHead {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// boolean variables can only hold one of two values - true or false

		/************************  SLEEPY HEAD  **************************/
		boolean isWeekend;
		// Write code to ask the user what day it is.
		String weekend = JOptionPane.showInputDialog("What day is it?");
		if(weekend.equalsIgnoreCase("Saturday"))	{
			isWeekend=true;
		}
		if(weekend.equalsIgnoreCase("Sunday"))	{
			isWeekend=true;
		}
		else	{
			isWeekend=false;
		}

		// Set the boolean isWeekend based on the value they enter
       
		// If it is the weekend, tell the user they get to sleep in.
        if(isWeekend) {
        	JOptionPane.showMessageDialog(null, "You get to sleep in!");
        }
        if(!isWeekend)	{
        	JOptionPane.showMessageDialog(null, "Get out of bed and go to school!");
        }
      
		// If it is not the weekend, tell them to get out of bed and go to school!
		
		
		/************************   STAR STUDENT  **************************/

		boolean passedExam;
		// Write code to ask the user what percentage they scored in their last exam
String testscore = JOptionPane.showInputDialog("What was your test score? (Only integers allowed)");
int test = Integer.parseInt(testscore);
		
		// If they scored more than 70, they passed the exam.
if(test>70) {
	passedExam = true;
}
else	{
	passedExam = false;
}
		// Set the boolean passedExam based on their score.
		
		// If the user passed the exam, congratulate them
	if(passedExam)	{
		JOptionPane.showMessageDialog(null, "Congratulations!");
	}
	if(!passedExam) {
		JOptionPane.showMessageDialog(null, "Better luck next time.");
	}
		// otherwise, wish them better luck next time.
		
		
		/************************  GAME OVER  **************************/

		boolean gameIsOver = false;
		// This code will repeat until gameIsOver is changed to true
		while (!gameIsOver) {
			// Ask the user if the game is over. 
			String gameOver = JOptionPane.showInputDialog("is game over");
			if (gameOver.equalsIgnoreCase("yes"))
				gameIsOver = true;
			
			// If they answer "yes", change gameIsOver to true

		}
		// Tell the user "game is over" 
		
		
		/***********************   RED SQUARE  ********************/
		
		boolean isRed = true;
		// Ask the user what color to draw with. Based on their answer, set the isRed variable
		String color = JOptionPane.showInputDialog("What color do you want to draw with: Red or Blue?");
		if(color.equalsIgnoreCase("Blue"))	{
		isRed = false;
		}
		
		boolean isSquare = true;		
		// Now ask the user what shape to draw. Based on their answer, set the isSquare variable
		
		String shape = JOptionPane.showInputDialog("What shape do you want to draw: a square or a pentagon");
		if(shape.equalsIgnoreCase("pentagon"))	{
			isSquare = false;
		}
 if(isRed&&isSquare)	{
	 drawRedSquare();
 }
		// Now you MUST use the && operator to join the booleans for this code. 
		// Ask your teacher if you are not sure how
		// Use an if statement to ONLY draw a red square when it has been requested (use the method below)
		// otherwise, tell the user you don't know how to draw that shape
		

	}

	
	@SuppressWarnings("unused")
	static void drawRedSquare() {
		Robot rob = new Robot("mini");
		rob.setSpeed(10);
		rob.penDown();
		rob.setPenColor(Color.red);
		for (int i = 0; i < 4; i++) {
		rob.move(200);
		rob.turn(90);
		}
		// Complete the rest of this method
	}	
}
