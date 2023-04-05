package genericos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class UsaPessoa {

  public static void main(String[] args) {
    ArrayList<Pessoa> pessoas = new ArrayList<>();
    pessoas.add(new Pessoa("MARIA", 28));
    pessoas.add(new Pessoa("ANTONIO", 35));
    pessoas.add(new Pessoa("JOSE", 20));

    PessoaComparator pc = new PessoaComparator();

    Collections.sort(pessoas, pc);
    for (Pessoa x : pessoas)
      System.out.println(x.getNome());
  }

}
