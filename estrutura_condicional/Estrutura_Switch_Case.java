package estrutura_condicional;
import java.util.Scanner;

public class Estrutura_Switch_Case {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String dia;

        switch (x) {
            case 1: dia = "domingo";
                break;
            case 2: dia = "Segunda";
                break;
            case 3: dia = "Terça";
                break;
            case 4: dia = "Quarta";
                break;
            case 5: dia = "Quinta";
                break;
            case 6: dia = "Sexta";
                break;
            case 7: dia = "Sábado";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + x);
        }
        System.out.println("Dias da Semana: " + dia);
        sc.close();
    }

}
