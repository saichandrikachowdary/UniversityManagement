package Com.Codegnan.Exceptions;

public class tryandcatch {

	public static void main(String[] args) {

		try {
			System.out.println("Statement 1");
			System.out.println("Statement 2");
			System.out.println("Statement 3");

			// System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			System.out.println("Statement 4");
		} finally {
			System.out.println("Statement 5");
			System.out.println("Statement 6");

		}

	}

}
