import java.util.Scanner;

public class Atividade13 {

     public static void main (String[] args) {
        Scanner entrada = new Scanner (System.in);
        double preP, novoP;
        System.out.print( "Me informe o Valor do Produto: ");
        preP = entrada.nextDouble();
        
        if (preP <= 50) {
            novoP = preP * 1.05;
            System.out.println( "O preço do produto será: " + novoP );
            System.out.print( "O preço do produto é Barato");
        } else if ((preP > 50) && (preP <= 80)) {
            novoP = preP * 1.10;
            System.out.println( "O preço do produto será: " + novoP );
            System.out.print( "O preço do produto é Barato");
        } else if ((preP <= 100) && (preP < 120)) {
            novoP = preP * 1.10;
            System.out.println( "O preço do produto será: " + novoP );
             System.out.print( "O preço do produto é Normal");
        } else if ((preP > 100)  && (preP >= 120)) {
            novoP = preP * 1.15;
            System.out.println( "O preço do produto será: " + novoP );
            System.out.print( "O preço do produto é Caro");
        }  else if ((preP > 100)  && (preP <= 200)) {
            novoP = preP * 1.15;
            System.out.println( "O preço do produto será: " + novoP );
            System.out.print( "O preço do produto é Caro");
        } else if ((preP > 100)  && (preP > 200)) {
            novoP = preP * 1.15;
            System.out.println( "O preço do produto será: " + novoP );
            System.out.print( "O preço do produto é Muito Caro" );
        }
        entrada.close();


     }
}
