//: arrays/MultidimensionalObjectArrays.java
import java.util.*;

class BerylliumSphere{
	private static long counter;
	private final long id = counter++;
	public String toString() {
		return "Sphere " + id;
	}
}
public class MultidimensionalObjectArrays {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BerylliumSphere[][] spheres = {
				{ new BerylliumSphere(), new BerylliumSphere()},
				{ new BerylliumSphere(), new BerylliumSphere(),
				  new BerylliumSphere(), new BerylliumSphere() },
				{ new BerylliumSphere(), new BerylliumSphere(),
				  new BerylliumSphere(), new BerylliumSphere(),
				  new BerylliumSphere(), new BerylliumSphere(),
				  new BerylliumSphere(), new BerylliumSphere()}
		};
		System.out.println(Arrays.deepToString(spheres));
	}

}/* Output:
[[Sphere 0, Sphere 1], [Sphere 2, Sphere 3, Sphere 4, Sphere 5], [Sphere 6, Sphere 7, Sphere 8, Sphere 9, Sphere 10, Sphere 11, Sphere 12, Sphere 13]]
*///:~
