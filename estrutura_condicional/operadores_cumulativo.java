package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class operadores_cumulativo {
    public static void main(String[] args){
     /*Um plano básico de internet móvel custa R$ 79,90 e dá direito a 100
     * minutos para falar para qualquer operadora. Cada minuto que exceder
     * a franquia de 100 minutos custa R$ 2,00. Faça um programa para ler
     * a quantidade de minutos que uma pessoa consumiu e mostre o valor
     * a ser pago.*/
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int minutos = sc.nextInt();
        double conta = 50.0;
        if (minutos > 100){
            conta += (minutos - 100) * 2.0;
        }
        System.out.printf("Valor da conta = R$ %.2f%n", conta);

        sc.close();
    }
}
