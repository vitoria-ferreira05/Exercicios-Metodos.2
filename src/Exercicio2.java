import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        //2. Escreva um método que verifique se todos os caracteres em
        //uma determinada string são vogais ou não. Retorne true se
        //cada caractere na string for uma vogal, caso contrário, retorna
        //false.
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        String letra = sc.next();

        verificacaoCaracteres(letra);

    }

    private static boolean verificacaoCaracteres(String letra) {

        String letrasVogais = "a, b, c, d , e";
        String letras = letra.toLowerCase();

        for (int i = 0; i < letras.length(); i++){

            if (letra == letrasVogais){
                System.out.println("E vogal");
                return true;
            }
        }
        System.out.println("E consoante");
        return false;
    }
}


