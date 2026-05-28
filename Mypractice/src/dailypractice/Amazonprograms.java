package dailypractice;

public class Amazonprograms {
	Amazonprograms() {
		System.out.println("constructor1");
	}

	Amazonprograms(int a) {
		System.out.println("constructor2");

	}

	Amazonprograms(int a, double d) {
		System.out.println("constructor 3");
	}

	public static void main(String[] args) {
		new Amazonprograms();
		new Amazonprograms(10);
		new Amazonprograms(10, 10.5);

	}
}
