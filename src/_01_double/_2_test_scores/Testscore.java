package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class Testscore {

	public static void main(String[] args) {
		
		String score = JOptionPane.showInputDialog("What is your test score? (decimals are allowed)");
	
		int scorei = Integer.parseInt(score);
		
		double scored = scorei;
		
		if(scored>=85) {
			JOptionPane.showMessageDialog(null, "Wow! You must have studied really hard for that test!");
		}
		if(scored<85) {
			JOptionPane.showMessageDialog(null, "Ya need to study harder, pal");
		}
		
	}
	}

