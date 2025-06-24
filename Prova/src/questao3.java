
import java.util.ArrayList;
import java.util.Scanner;

public class questao3 {
    static Scanner sc = new Scanner(System.in);
    static double saldo =0.0;



    public static void main(String[] args) {
        lerSaudo();
        int op;
        do {
            op = 0;
            exib(menu());
            op = lerInt();
            switch (op) {
                case 1:
                    operacaoDeposito();
                    break;
                case 2:
                    operacaoSaque();
                    break;
            }
        } while (op != 3);

    }

    static int lerInt() {
        return sc.nextInt();
    }

    static double lerDouble() {
        return sc.nextDouble();
    }

    static void exib(String msg) {
        System.out.println(msg);
    }

    static String menu() {
        String m = "1 - Depositar\n" +
                "2 - Sacar\n" +
                "3 - Sair";
        return m;
    }

    static void lerSaudo() {
        exib("Digite o saldo atual: ");
        saldo = lerDouble();
    }

    static void operacaoDeposito() {
        exib("Quanto quer depositar?");
        double valor = lerDouble();
        saldo += valor;
        exib("Depósito realizado com sucesso!");
        exib("Saldo atualizado: R$" + saldo);
    }

    static void operacaoSaque() {
        exib("Quanto quer sacar?");
        double valor = lerDouble();
        if (valor > saldo) {
            exib("Saque inválido: saldo insuficiente.");
        } else {
            saldo -= valor;
            exib("Saque realizado com sucesso!");
            exib("Saldo atualizado: R$" + saldo);
        }
    }
}

