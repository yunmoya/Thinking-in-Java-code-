package practice2;

import java.util.Arrays;

//: arrays/practice/Practice2
class BerylliumSphere {
	private static long counter;
	private final long ID = counter ++;
	public String toString() {
		return "Sphere " + ID;
	}
}
class A {
	static BerylliumSphere[] methodsA(int n) {
		BerylliumSphere[] bs = new BerylliumSphere[n];
		for(int i = 0;i < bs.length;i ++)
			bs[i] = new BerylliumSphere();
		return bs;
	}
}
public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BerylliumSphere[] bs = A.methodsA(5);
		System.out.println(Arrays.toString(bs));
	}

}/* Output:
[Sphere 0, Sphere 1, Sphere 2, Sphere 3, Sphere 4]
*///:~
