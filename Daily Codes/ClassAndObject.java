public class ClassAndObject {	

	int i;
	boolean b;

	/*public ClassAndObject() {}*/

	public ClassAndObject() {
		System.out.println("This is Constructor");
	}

	public ClassAndObject(char c) {
		System.out.println("This is Constructor: " + c);
	}

	public void show() {
		/*System.out.println("I am from show");*/
		System.out.println("i = " + i + ", b = " + b);
	}

	public int square(int a) {
		return a*a;
	}

	public static void main(String[] args) {
		/*ClassAndObject cO;*/
		ClassAndObject cO1 = new ClassAndObject('A');
		ClassAndObject cO2 = new ClassAndObject();

		cO1.i = 10;
		cO1.b = true;
		System.out.println(cO1.b);
		cO1.show();
		System.out.println(cO1.square(25));
	}

}