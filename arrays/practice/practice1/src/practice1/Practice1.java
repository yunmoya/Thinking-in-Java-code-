//: arrays\practice\practice1

package practice1;
class BerylliumSphere {
	private static long counter;
	private final long ID = counter ++;
	public String toString() {
		return "Sphere " + ID;
	}
}
class A {
	public void hide(BerylliumSphere[] a) {
		System.out.println("arrays length: " + a.length);
	}
}
public class Practice1 {
	public static void main(String[] args) {
		A a = new A();
		// Dynamic aggregate initialization
		a.hide(new BerylliumSphere[] { new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere()});
		// Dynamic aggregate initialization in the next case
		BerylliumSphere[] b = new BerylliumSphere[] {new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere()};
		a.hide(b);
		// Aggregate initialization
		BerylliumSphere[] c ={new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere()};
		a.hide(c);
	}
}/* Output:
arrays length: 3
arrays length: 3
arrays length: 3
*///:~
