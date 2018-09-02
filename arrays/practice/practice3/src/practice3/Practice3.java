package practice3;

import java.util.Arrays;
import java.util.Random;

class Create2D {
	static double[][] a;
	public static void create2D(int capacityx, int capacityy, double a1, double a2) {
		Random rand = new Random();
		a = new double[capacityx][capacityy];
		for(int i = 0;i < a.length; i ++) {
			for(int j = 0;j < a[i].length;j ++) {
				a[i][j] = a1 + rand.nextInt((int) Math.round(a2)-(int)Math.round(a1)) ;
			}
		}
	}
	public static void print() {
		System.out.println(Arrays.deepToString(a));
	}
}
public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Create2D.create2D(5, 4, 15.3, 20.2);
		Create2D.print(); 
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		Create2D.create2D(9, 2, 1, 90.5);
		Create2D.print();
	}

}/* Output:
[[15.3, 17.3, 15.3, 17.3], [16.3, 15.3, 16.3, 15.3], [15.3, 19.3, 17.3, 15.3], [16.3, 19.3, 18.3, 16.3], [18.3, 17.3, 17.3, 19.3]]
XXXXXXXXXXXXXXXXXXXXXXXXXXXXX
[[88.0, 84.0], [68.0, 64.0], [12.0, 52.0], [75.0, 20.0], [70.0, 39.0], [61.0, 10.0], [46.0, 7.0], [12.0, 81.0], [65.0, 61.0]]
*///:~
