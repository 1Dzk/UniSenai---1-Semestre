
import java.util.ArrayList;
import java.util.Scanner;

public class questao1 {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> nomes = new ArrayList<String>();
    static ArrayList<String> curso = new ArrayList<String>();

    public static void main(String[] args) {
        int qtd = qtdAlunos();
        cadastrarAlunos(qtd);
        total();
    }

    static int qtdAlunos() {
        exib("Quantos alunos serão cadastrados ?");
        return sc.nextInt();
    }

    static void exib(String msg) {
        System.out.println(msg);
    }

    static void cadastrarAlunos(int qtd) {
        for (int i = 0; i < qtd; i++) {
            exib("Digite o nome: ");
            nomes.add(lerString());
            exib("Digite o curso: ");
            curso.add(lerString());
        }
    }

    static String lerString() {
        return sc.next();
    }

    static int lerInt() {
        return sc.nextInt();
    }

    static double calcularPercentual(int quantidade, int total) {
        if (total == 0) return 0.0;
        return (quantidade * 100.0) / total;
    }

    static void total() {
        int total = curso.size();
        double qtdCurso = 0;
        int qtdAds = 0;
        for (String cursos : curso) {
            switch (cursos) {
                case "ADS":
                    qtdAds++;
                    break;
            }
            qtdCurso++;
        }
        exib("Quantidade de alunos: " + total);
        exib("Quantidade de cursos: " + qtdCurso);
        exib("Quantidade de ads: " + calcularPercentual(qtdAds, total));
    }
}