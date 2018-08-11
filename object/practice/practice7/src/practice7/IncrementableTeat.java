package practice7;

public class IncrementableTeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Incrementable sf = new Incrementable();
		System.out.println("pre: "+StaticTest.i);
		sf.increment();
		System.out.println("last: "+StaticTest.i);
	}

}/* Output:
pre: 47
last: 48
*///:~