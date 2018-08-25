package algorithms;

public class Fibonacci {
	public static void main(String[] args) {

int newN;
int seclast = 0 ;
int last = 1;
for(int i = 3; i < 12; i++) {
newN= last+seclast;
seclast = last;
last = newN;
System.out.println(newN);
}	
	
	
	
	
	
	
	
	
	}
}