import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        //5. Escreva um programa Java que receba um número do usuário
        //e gere um inteiro entre 1 e 7. Ele exibe o nome do dia da
        //semana. Nota: usem switch case.

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero e verifique o dia da semana: ");
        int dia = sc.nextInt();


        switch (dia) {
            case 1:
                System.out.println("Segunda-Feira");
                break;
            case 2:
                System.out.println("Terça-Feira");
                break;
            case 3:
                System.out.println("Quarta-Feira");
                break;
            case 4:
                System.out.println("Quinta-Feira");
                break;
            case 5:
                System.out.println("Sexta-Feira");
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;

        }
    }
}
