package com.mcnz.rps;

import javax.swing.JOptionPane;
# adding new line for cherry-picking
public class Game {
	
	public static void main(String[] args) {
		String prompt = "Will it be rock, paper or scissors?";
		String input = JOptionPane.showInputDialog(prompt);
# adding second line for cherry-picking
		System.out.println("You selected: " + input);
	}

}
