import java.util.ArrayList;
import java.util.Scanner;

public class questao5 {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> nome = new ArrayList<String>();
    static ArrayList<Integer> produto = new ArrayList<Integer>();

    public static void main(String[] args) {
        int op;
        do {
            exib(menu());
            op = lerInt();
            switch (op) {
                case 1:
                    cadastrar();
                    break;
                case 2:
                    buscNome();
                    break;
                case 3:
                    listMaior();
                    break;
                case 4:
                    exib("Fim do programa");
                    break;
                default:
                    exib("Opção invalida");
            }
        } while (op != 4);
    }

    static String menu() {
        String m = "1 - Cadastrar\n" +
                "2 - Buscar por nome\n" +
                "3 - Listar todos q são precisam mais de 10\n" +
                "4 - Sair";
        return m;
    }

    static int lerInt() {
        return sc.nextInt();
    }

    static String lerString() {
        return sc.next();
    }

    static void cadastrar() {
        exib("Digite o nome do produto: ");
        nome.add(lerString());
        exib("Digite a quantidade de produtos: ");
        produto.add(lerInt());
    }

    static void exib(String m) {
        System.out.println(m);
    }

    static void buscNome() {
        if (nome.isEmpty()) {
            exib("Nenhum produto foi cadastrado.");
            return;
        }
        exib("Digite o nome do produto para busca: ");
        String prodBusca = lerString();
        boolean encontrado = false;

        for (int i = 0; i < nome.size(); i++) {
            if (nome.get(i).equalsIgnoreCase(prodBusca)) {
                exib("Produto encontrado:");
                exib("Nome: " + nome.get(i));
                exib("Quantidade: " + produto.get(i));
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            exib("Produto não encontrado.");
        }
    }

    static void listMaior() {
        String msg = "Produtos com mais de 10 unidades:\n";
        boolean encontrou = false;

        for (int i = 0; i < nome.size(); i++) {
            if (produto.get(i) >= 10) {
                msg += (i + 1) + " - " + nome.get(i) + ": " + produto.get(i) + "\n";
                encontrou = true;
            }
        }

        if (encontrou) {
            exib(msg);
        } else {
            exib("Nenhum produto com mais de 10 unidades.");
        }
    }
}

