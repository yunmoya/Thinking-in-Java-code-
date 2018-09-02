package practice6;

import java.util.Arrays;

class BerylliumSphere {
	private static long counter;
	private final long ID = counter ++;
	public String toString() {
		return "Sphere " + ID;
	}
}
public class Practice6 {
	public static BerylliumSphere[][] createBerylliumSphereArray(int lenx, int leny) {
		BerylliumSphere[][] b = new BerylliumSphere[lenx][leny];
		for(int i = 0;i < b.length;i ++) {
			for(int j = 0;j < b[i].length; j ++) {
				b[i][j] = new BerylliumSphere();
			}
		}
		return b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.deepToString(createBerylliumSphereArray(3, 5)));
	}

}/*Output:
[[Sphere 0, Sphere 1, Sphere 2, Sphere 3, Sphere 4], [Sphere 5, Sphere 6, Sphere 7, Sphere 8, Sphere 9], [Sphere 10, Sphere 11, Sphere 12, Sphere 13, Sphere 14]]
*///:~