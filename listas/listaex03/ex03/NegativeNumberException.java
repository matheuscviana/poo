package lista2.ex03;

public class NegativeNumberException extends Exception {

  private static final long serialVersionUID = 2491001844177980617L;

  public NegativeNumberException(int n) {
    super("Número negativo: " + n);
  }

}
