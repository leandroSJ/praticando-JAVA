package estrutura_sequencial;

import java.util.Scanner;
public class EntradaDeDados {

    public static void main(String[] args) {

        //Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        String nome, endereco;
        int opcaoEscolha;
        long cpf;
        double limiteCredito;
        char sexo;


        System.out.println("*******************");
        System.out.println("Cadastro de clientes");
        System.out.println("*******************");

        System.out.print("Nome: ");
        nome = scan.next();

        System.out.print("Endereço: ");
        endereco = scan.nextLine();
        scan.nextLine();

        System.out.print("CPF: ");
        cpf = scan.nextLong();


        System.out.print("Limite: ");
        limiteCredito = scan.nextDouble();

        System.out.print("Sexo: ");
        sexo = scan.next().charAt(0);
        scan.nextLine();


        System.out.println("*******************");
        System.out.println("Cliente Cadastrado !");
        System.out.print("*******************\n\n");

        System.out.println("---- MENU ---- ");
        System.out.println("1 - Exibir Clientes Cadastrados ");
        System.out.print("2 - Cadastrar novo cliente ! \n\n");
        System.out.print("Escolha uma opção: ");


        Scanner sc = new Scanner(System.in);
        opcaoEscolha = sc.nextInt();
        sc.nextLine();

        if (1 == opcaoEscolha) {
            System.out.printf("Nome: %s\nEndereço: %s\nCPF: %d\nLimite: %.2f\nSexo: %c\n\n", nome, endereco, cpf, limiteCredito, sexo);
        } else if (opcaoEscolha == 2) main(args);

        sc.close();
    }
}
