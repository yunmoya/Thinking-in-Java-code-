
class Create3D {
	static double[][][] a;
	public static void create3D(int capacityx, int capacityy, int capacityz, double a1, double a2) {
		a = new double[capacityx][capacityy][capacityz];
		double increment = (a2 - a1) / (capacityx * capacityy * capacityz);
		for(int i = 0;i < a.length; i ++) {
			for(int j = 0;j < a[i].length;j ++) {
				for(int k = 0;k < a[i][j].length; k ++) {
					a[i][j][k] = a1;
					a1 += increment;
				}
				
			}
		}
	}
	
	public static void print() {
		for(int i = 0;i < a.length; i ++) {
			for(int j = 0;j < a[i].length;j ++) {
				for(int k = 0;k < a[i][j].length; k ++) {
					System.out.printf("%.3f ",a[i][j][k]);
				}
			System.out.println();
			}
			System.out.println();
		}
	}
}
public class Practuce4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Create3D.create3D(5, 3, 2, 90, 100);
		Create3D.print();
	}

}/*Output:
90.000 90.333 
90.667 91.000 
91.333 91.667 

92.000 92.333 
92.667 93.000 
93.333 93.667 

94.000 94.333 
94.667 95.000 
95.333 95.667 

96.000 96.333 
96.667 97.000 
97.333 97.667 

98.000 98.333 
98.667 99.000 
99.333 99.667 

*///:~
