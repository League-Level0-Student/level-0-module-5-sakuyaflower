package algorithms;

import javax.swing.JOptionPane;

public class PrimeorNot {
	public static void main(String[] args) {
	
String answer = JOptionPane.showInputDialog(null,"Name a prime number.");	
int number=Integer.parseInt(answer);
for(int i = 2; i < number; i++) {
if(number%i==0) {
JOptionPane.showMessageDialog(null,"That is not a prime number.");	
System.exit(0);
}
}	
JOptionPane.showMessageDialog(null,"You found a prime number.");
	
	
	
	
	
	
	
	
	}
}