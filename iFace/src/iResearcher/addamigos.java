package iResearcher;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class addamigos {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    // [ A ] declarando e instanciando uma agenda de contatos
    ArrayList<String> contato = new ArrayList();

    // [ B ] usando o método add() para gravar 4 contatos na agenda
    contato.add("nome1");
    contato.add("nome2");
    contato.add("nome3");
    contato.add("nome4");

    int i;

    // [ C ] mostrando os "n" contatos da agenda (usando o índice)
    // número de elementos da agenda: método size()
    System.out.printf("Percorrendo o ArrayList (usando o índice)\n");
    int n = contato.size();
    for (i=0; i<n; i++) {
      System.out.printf("Posição %d- %s\n", i, contato.get(i));
    }

    System.out.printf("\nInforme a posição a ser excluída:\n");
    i = ler.nextInt();

    try {
      // [ D ] remove o i-ésimo contato da agenda
      contato.remove(i);
    } catch (IndexOutOfBoundsException e) {
        // exceção lançada para indicar que um índice (i)
        // está fora do intervalo válido (de 0 até agenda.size()-1)
        System.out.printf("\nErro: posição inválida (%s).",
          e.getMessage());
    }

    // [ E ] mostrando os "n" contatos da agenda (usando for-each)
    System.out.printf("\nPercorrendo o ArrayList (usando for-each)\n");
    i = 0;
    for (String contato2: contato) {
      System.out.printf("Posição %d- %s\n", i, contato2);
      i++;
    }

    // [ F ] mostrando os "n" contatos da agenda (com iterator)
    System.out.printf("\nPercorrendo o ArrayList (usando iterator)\n");
    i = 0;
    Iterator<String> iterator = contato.iterator();
    while (iterator.hasNext()) {
      System.out.printf("Posição %d- %s\n", i, iterator.next());
      i++;
    }
  }

}