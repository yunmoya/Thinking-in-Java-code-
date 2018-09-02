package practice7;

import java.util.Arrays;

class BerylliumSphere {
	private static long counter;
	private final long ID = counter ++;
	public String toString() {
		return "Sphere " + ID;
	}
}
public class Practice7 {
	public static BerylliumSphere[][][] createBerylliumSphereArray(int lenx, int leny, int lenz) {
		BerylliumSphere[][][] b = new BerylliumSphere[lenx][leny][lenz];
		for(int i = 0;i < b.length;i ++) {
			for(int j = 0;j < b[i].length; j ++) {
				for(int k = 0;k < b[i][j].length;k ++) {
					b[i][j][k] = new BerylliumSphere();
				}	
			}
		}
		return b;
	}
	public static void main(String[] args) {
		System.out.println(Arrays.deepToString(createBerylliumSphereArray(3,4,5) ));
	}
}/* Output:
[[[Sphere 0, Sphere 1, Sphere 2, Sphere 3, Sphere 4], [Sphere 5, Sphere 6, Sphere 7, Sphere 8, Sphere 9], [Sphere 10, Sphere 11, Sphere 12, Sphere 13, Sphere 14], [Sphere 15, Sphere 16, Sphere 17, Sphere 18, Sphere 19]], [[Sphere 20, Sphere 21, Sphere 22, Sphere 23, Sphere 24], [Sphere 25, Sphere 26, Sphere 27, Sphere 28, Sphere 29], [Sphere 30, Sphere 31, Sphere 32, Sphere 33, Sphere 34], [Sphere 35, Sphere 36, Sphere 37, Sphere 38, Sphere 39]], [[Sphere 40, Sphere 41, Sphere 42, Sphere 43, Sphere 44], [Sphere 45, Sphere 46, Sphere 47, Sphere 48, Sphere 49], [Sphere 50, Sphere 51, Sphere 52, Sphere 53, Sphere 54], [Sphere 55, Sphere 56, Sphere 57, Sphere 58, Sphere 59]]]
*///:~