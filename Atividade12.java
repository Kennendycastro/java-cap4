import java.util.Scanner;

public class Atividade12 {

    public static void main (String[] args) {
        Scanner entrada = new Scanner (System.in);
        double salarioB, salFinal, impostoSal;
    
        System.out.print( "Me informe o Valor do Salário Bruto: ");
        salarioB = entrada.nextDouble();
        impostoSal = salarioB * 0.07;
      
        if (salarioB < 350) {
          salFinal = salarioB + 100 - impostoSal;
          System.out.println("O seu salário final será: " + salFinal);
        } else if ((salarioB > 350) && (salarioB < 600)) {
          salFinal = salarioB + 75 - impostoSal;
          System.out.println("O seu salário final será: " + salFinal);  
        } else if ((salarioB >= 600) && (salarioB <= 900)) {
          salFinal = salarioB + 50 - impostoSal;
          System.out.println("O seu salário final será: " + salFinal); 
        } else if (salarioB > 900) {
          salFinal = salarioB + 35 - impostoSal;
          System.out.println("O seu salário final será: " + salFinal);  
        }
        

        entrada.close();
    }
}
