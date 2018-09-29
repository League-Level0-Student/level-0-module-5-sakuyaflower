package algorithms;

import java.util.concurrent.SynchronousQueue;

import javax.swing.JOptionPane;

public class For_Loop_Gauntlet {
	public static void main(String[] args) {

		for (int i = 0; i < 101; i++) {
			System.out.println(i);
		}
		for (int l = 100; l > 0; l--) {
			System.out.println(l);
		}
		for (int y = 2; y < 101; y++) {
			if (y % 2 == 0) {
				System.out.println(y);
			}
		}
		for (int t = 1; t < 100; t++) {
			if (t % 2 != 0) {
				System.out.println(t);
			}
		}
		for (int r = 1; r < 501; r++) {
			if (r % 2 == 0) {
				System.out.println(r + " is even.");
			} else if (r % 2 != 0) {
				System.out.println(r + " is odd.");
			}
		}
		for (int p = 0; p < 778; p++) {
			if (p % 7 == 0) {
				System.out.println(p);
			}
		}

		for (int x = 2005; x < 2019; x++) {
			System.out.println("In " + x + " i was " + (x - 2005) + " years old");
		}

		for (int i = 0; i < 3; i++) {
			for (int s = 0; s < 3; s++) {
				System.out.println(i + " " + s);
			}
		}

		for (int i = 0; i < 9; i += 3) {
			for (int t = 1; t <= 3; t++) {

				System.out.print(t + i);
			}
			System.out.println();
		}

		for (int i = 0; i < 100; i +=10) {
			for (int t = 1; t < 11; t++) {
System.out.print(t+i+" ");
			}
		System.out.println();
		}

for(int i = 1; i < 7; i++) {
	for(int t = 0; t < i; t++) {
		System.out.print("*");
	}
System.out.println();
}
	for(int i = 0; i < 100; i++) {
		System.out.println(100-i);
		
	}
	
	
	
	
	
	}
}
