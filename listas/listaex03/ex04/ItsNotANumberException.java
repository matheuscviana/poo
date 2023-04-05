package lista2.ex04;

public class ItsNotANumberException extends Exception {

	private static final long serialVersionUID = -841117120621339142L;

	public ItsNotANumberException(String s) {
		super("\"" +s + "\" não é um número.");
	}

}
