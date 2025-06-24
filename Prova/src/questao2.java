import java.util.ArrayList;
import java.util.Scanner;

public class questao2 {
    static ArrayList<Double> salario = new ArrayList<Double>();
    static ArrayList<Double> venda = new ArrayList<Double>();
    static ArrayList<Double> novoSalario = new ArrayList<Double>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        salarioFixo();
        totalVendas();
        novoSalario();
        listarSalario();
    }

    static void exib(String msg) {
        System.out.println(msg);
    }

    static double lerDouble() {
        return sc.nextDouble();
    }

    static void salarioFixo() {
        exib("Salario Fixo: ");
        salario.add(lerDouble());
    }

    static void totalVendas() {
        exib("Total de Vendas: ");
        venda.add(lerDouble());
    }

    static void novoSalario() {
        double newSal = 0;
        for (int i = 0; i < venda.size(); i++) {
            if (venda.get(i) >= 20000.00) {
                newSal = salario.get(i) * 1.20;
            }
            if (venda.get(i) < 20000.00) {
                newSal = salario.get(i) * 1.10;
            }
        }
        novoSalario.add(newSal);
    }

    static void listarSalario() {
        for (int i = 0; i < salario.size(); i++) {
            System.out.println("Salario Original: " + salario.get(i));
            System.out.println("Salario Final: " + novoSalario.get(i));
        }
    }
}

