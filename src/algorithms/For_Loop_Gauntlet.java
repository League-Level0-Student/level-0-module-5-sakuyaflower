package algorithms;

import javax.swing.JOptionPane;

public class For_Loop_Gauntlet {
	 public static void main(String[] args) {

	 for(int i = 0; i < 101; i++) { 
	 System.out.println(i);
	 }
	 for(int l = 100; l > 0; l --) {
		System.out.println(l); 
	 }
	 for(int y = 2; y < 101; y++) {
		 if(y%2==0) {
			 System.out.println(y);
		 }
	 }
	 for(int t = 1; t < 100; t++) {
	     if(t%2!=0) {
	    	 System.out.println(t);
	     }
	 }
	 for(int r = 1; r < 501; r++) {
		 if(r%2==0) {
System.out.println(r+" is even.");
		 }
		 else if(r%2!=0) {
System.out.println(r+" is odd.");			 
		 }
	 }
	 for(int p = 0; p < 778; p++) {
	     if(p%7==0) {
	    	 System.out.println(p);
	     }
	 }
	
	
	for(int x = 2005; x < 2019; x++) {
		System.out.println("In " + x + " i was " + (x-2005) +" years old" );
	}
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 }
}