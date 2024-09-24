package Com.Codegnan.Exceptions;

class TooYoungException extends Exception {
	public TooYoungException(String message) {
		super(message);
	}
}

class TooOldException extends Exception {
	public TooOldException(String message) {
		super(message);
	}
}

public class CustomizedException {
	public void checkEligibility(int age) throws TooYoungException, TooOldException {
		if (age < 18) {
			throw new TooYoungException("Marriage Cannot Approved : Age is below 18 years");
		} else if (age > 60) {
			throw new TooOldException("Your age is already crossed the marriage age..Marriage Cannot Approved");
		} else {
			System.out.println("Marriage Approved! Details will be processed soon..");
		}
	}

	public static void main(String[] args) {
		CustomizedException checker = new CustomizedException();
		try {

			checker.checkEligibility(20);
			checker.checkEligibility(65);
			checker.checkEligibility(16);
		} catch (TooYoungException e) {
			e.printStackTrace();
		} catch (TooOldException e) {
			e.printStackTrace();
		}

	}
}
