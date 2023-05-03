import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        //4. Escreva um programa que leia um número em polegadas e o
        //converta em metros. Nota: Uma polegada é 0,0254 metros.

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor em polegadas: ");
        double polegadas = sc.nextDouble();

        double metros = polegadas / 39.37;

        double coneversao = alteracaoParaMetros(metros);

        System.out.println("As polegadas em metros e: " + metros);
    }

    private static double alteracaoParaMetros(double metros) {
        return metros;
    }
}
