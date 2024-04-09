package exception.bruno;

public class BrunoException extends RuntimeException {

	public BrunoException() {
		super();
	}

	public BrunoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public BrunoException(String message, Throwable cause) {
		super(message, cause);
	}

	public BrunoException(String message) {
		super(message);
	}

	public BrunoException(Throwable cause) {
		super(cause);
	}

}
