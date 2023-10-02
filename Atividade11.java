import java.util.Scanner;

public class Atividade11 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    double salarioA, novoSal, aumentoSal;

    System.out.print("Me informe o Valor do Salário: ");
    salarioA = entrada.nextDouble();

    if (salarioA <= 300) {
      aumentoSal = salarioA * 0.15;
      System.out.println("O aumento no seu Salário será: " + aumentoSal);
      novoSal = aumentoSal + salarioA;
      System.out.print("O seu Salário será: " + novoSal);
    } else if ((salarioA > 300) && (salarioA < 600)) {
      aumentoSal = salarioA * 0.10;
      System.out.println("O aumento no seu Salário será: " + aumentoSal);
      novoSal = aumentoSal + salarioA;
      System.out.print("O seu Salário será: " + novoSal);
    } else if ((salarioA >= 600) && (salarioA <= 900)) {
      aumentoSal = salarioA * 0.05;
      System.out.println("O aumento no seu Salário será: " + aumentoSal);
      novoSal = aumentoSal + salarioA;
      System.out.print("O seu Salário será: " + novoSal);
    } else if (salarioA > 900) {
      novoSal = salarioA;
      System.out.println("O seu Salário será: " + novoSal);
      System.out.print("Não tera Direito a aumento! ");

      entrada.close();
    }
  }

}
