package chapter04;

public class ObjectTest01 {

	public static void main(String[] args) {
		Point p = new Point(10, 10);

		// Class klass = p.getClass();
		System.out.println(p.getClass()); // reflection
		System.out.println(p.hashCode()); // address 기반의 해싱값
										// address X
										// reference X
		System.out.println(p.toString()); // getClass() + "@" + hashCode()
		System.out.println(p);
	}

}
