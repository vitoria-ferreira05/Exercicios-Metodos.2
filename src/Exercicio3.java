import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        //3. Escreva um método para verificar se uma string é uma senha
        //válida.
        //
        //Regras de senha:
        //- Uma senha deve ter pelo menos dez caracteres.
        //- Uma senha consiste apenas em letras e dígitos.
        //- Uma senha deve conter pelo menos dois dígitos.

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a senha: ");
        String senha = sc.next();

        verificacaoSenha(senha);

    }

    public static boolean verificacaoSenha(String senha) {
        int digitos = 0;

        for (int i = 0; i < senha.length(); i++) {

            char c = senha.charAt(i);
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }
            if (Character.isDigit(c)) {
                digitos++;
            }
        }
        return senha.length() >= 10 && digitos >= 2;
    }
}