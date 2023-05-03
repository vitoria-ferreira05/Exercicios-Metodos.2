import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        //1. Escreva um método para verificar se cada dígito de um
        //determinado número inteiro é par. Retorna verdadeiro se todos
        //os dígitos forem pares, caso contrário, falso.

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = sc.nextInt();

        boolean numeroPar = verificarNumeroPar(numero);

        if (numero % 2 == 0) {
            System.out.println("O numero e par");
        } else {
            System.out.println("O numero e impar");
        }
    }

    private static boolean verificarNumeroPar(int numero) {
        return true;
    }
}










