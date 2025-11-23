import java.util.Scanner;
public class Main {
    public static Double Adicao(double a, double b){
        return a + b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Grupo 2\n" +
                "Desafio de Merge: “Simulando o controle de versão”\n ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double resultadoAdicao = Adicao(a, b);
        System.out.println("Resultado da adição: " + resultadoAdicao);


        int numero1 = 10;
        int numero2 = 4;
        int resultadoSubtracao = numero1 - numero2;

        System.out.println("Resultado da subtração: " + resultadoSubtracao);
    }
}
