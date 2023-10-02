import java.util.Scanner;

public class Atividade10 {
    public static void main (String[] args) {
        Scanner entrada = new Scanner (System.in);
        double preçoCon, custoF;
        System.out.print( "Me informe o custo de fabrica: ");
        custoF = entrada.nextDouble();
        if (custoF <= 12000.0) {
            preçoCon = custoF + ( custoF * 0.05);
        } else if (custoF <= 25000.0) {
            preçoCon = custoF + ( custoF * 0.25 );
        } else {
            preçoCon = custoF + (custoF * 0.35);
        }
        System.out.println("Preço ao consumidor: R$ " + preçoCon);
        entrada.close();
    }
    
}
