package arraysTut;

public class Application {
public static void main(String[] args) {
	int value = 7;
	int[] values;
	values = new int[4];
	
	System.out.println(values[0]);
	
	values[0] = 10;
	values[1] = 20;
	values[2] = 30;
	
	System.out.println(values[0]); //10 declared
	System.out.println(values[1]); //20 declared
	System.out.println(values[2]);// 30 declared
	System.out.println(values[3]); // 0 by default
//	System.out.println(values[4]); out of bounds
}
}

//to declare an array you declare using int[]