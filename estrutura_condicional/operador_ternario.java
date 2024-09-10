package estrutura_condicional;
import java.util.Scanner;

public class operador_ternario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double preco ;

        System.out.print("Valor: ");
        preco = sc.nextDouble();
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
        System.out.printf("Seu desconto é de R$ %.2f %n", desconto);

        sc.close();
    }
}
