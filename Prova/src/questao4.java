import java.util.ArrayList;
import java.util.Scanner;

public class questao4 {
    static ArrayList<Double> salario = new ArrayList<Double>();
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Integer> dependente = new ArrayList<Integer>();

    public static void main(String[] args) {
        salarioFixo();
        qtdDependente();
        salarioFinal();
    }

    static int lerInt() {
        return sc.nextInt();
    }

    static void exib(String m) {
        System.out.println(m);
    }

    static double lerDouble() {
        return sc.nextDouble();
    }

    static void salarioFixo() {
        exib("Salario: ");
        salario.add(lerDouble());
    }

    static void qtdDependente() {
        exib("Quantos dependentes: ");
        dependente.add(lerInt());
    }

    static void salarioFinal() {
        for (int i = 0; i < salario.size(); i++) {
            if (dependente.size() < -1) {
                exib("Salario: " + salario.get(i));
            }
            double novoSal = 0;
            for (double sal : dependente) {
                novoSal = salario.get(0) + (sal * 100);
            }
            exib("Salario: " + novoSal);
        }
    }
}
