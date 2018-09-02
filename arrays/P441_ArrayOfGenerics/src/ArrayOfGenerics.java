import java.util.*;

//: arrays/ArrayOfGenerics.java
// It is possible to create arrays of generics.
class BerylliumSphere{
	private static long counter;
	private final long id = counter++;
	public String toString() {
		return "Sphere " + id;
	}
}
public class ArrayOfGenerics {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>[] ls;
		List[] la = new List[10];
		ls = (List<String>[])la; // "Unchecked" waring
		ls[0] = new ArrayList<String>();
		//error:Type mismatch: cannot convert from ArrayList<Integer> to List<String>
		//ls[1] = new ArrayList<Integer>();
		Object[] objects = ls;
		//Compiles and runs without complant
		objects[1] = new ArrayList<Integer>();
		List<BerylliumSphere>[] spheres = (List<BerylliumSphere>[])new List[10];
		for(int i = 0; i < spheres.length; i ++) {
			spheres[i] = new ArrayList<BerylliumSphere>();
		}
	}

} ///:~
