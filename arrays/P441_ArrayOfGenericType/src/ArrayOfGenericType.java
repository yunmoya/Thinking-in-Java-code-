//: arrays/ArrayOfGernericType.java
// Arrays of generic types won't compile.
public class ArrayOfGenericType<T> {
	T[] array; //OK
	@SuppressWarnings("unchecked")
	public ArrayOfGenericType(int size) {
		//array = new T[size]; //Illegal
		array = (T[])new Object[size]; //"unchecked" Waring
	}
	//Illegal
	//Cannot create a generic array of U
//	public <U> U[] makeArray() {
//		return new U[10];
//	}
} ///:~
