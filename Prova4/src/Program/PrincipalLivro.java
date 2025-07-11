package Program;

import java.util.ArrayList;
import java.util.Scanner;

public class PrincipalLivro {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Livro> livros = new ArrayList<Livro>();

	public static void main(String[] args) {
		int op = 0;
		do {
			System.out.println(menu());
			op = sc.nextInt();
			switch (op) {
			case 1:
				cadastrarLivro();
				break;
			case 2:
				buscarTitulo();
				break;
			case 3:
				buscarPorValor();
				break;
			case 4:
				listarOrdenadoPorPagina();
				break;
			case 5:
				listarOrdenadoPorValor();
				break;
			case 6:
				System.out.println("Saindo do programa");
				break;
			default:
				System.out.println("Opção incorreta");
				break;
			}

		} while (op != 6);

	}

	static String menu() {
		String m = "1 - Cadastrar\n" + "2 - Buscar por título\n" + "3 - Buscar por valor\n"
				+ "4 - Listar todos ordenados por quantidade de páginas\n" + "5 - Listar todos ordenados por valor\n"
				+ "6 - Sair";
		return m;
	}

	static void cadastrarLivro() {
		Livro li = new Livro();

		System.out.println("Nome do livro: ");
		li.titulo = sc.next();
		System.out.println("Número de páginas: ");
		li.paginas = sc.nextInt();
		System.out.println("Valor do livro: ");
		li.valor = sc.nextDouble();
		livros.add(li);
		System.out.println("Livro cadastrado");
	}

	static void buscarTitulo() {
		String rs = "";
		System.out.println("Qual o título do livro?");
		String nmBusca = sc.next();
		for (Livro li : livros) {
			if (li.titulo.equalsIgnoreCase(nmBusca)) {
				rs += li + "\n";
			}
		}
		exibRetorno(rs);
	}

	static void exibRetorno(String rs) {
		if (rs.isEmpty()) {
			System.out.println("Não encontrado");
		} else {
			System.out.println(rs);
		}
	}

	static void buscarPorValor() {
		String rs = "";
		System.out.println("Qual o valor inial?");
		double nmValorInicial = sc.nextDouble();
		System.out.println("Qual o valor final?");
		double nmValorFinal = sc.nextDouble();
		for (Livro li : livros) {
			if (li.valor >= nmValorInicial && li.valor <= nmValorFinal) {
				rs += li + "\n";
			}
		}
		exibRetorno(rs);
	}

	static void ordenaPaginas() {
		Livro aux = new Livro();
		for (int i = 0; i < livros.size(); i++) {
			for (int j = i + 1; j < livros.size(); j++) {
				if (livros.get(j).paginas < livros.get(i).paginas) {
					aux = livros.get(j);
					livros.set(j, livros.get(i));
					livros.set(i, aux);
				}
			}
		}
	}

	static void listarOrdenadoPorPagina() {
		ordenaPaginas();
		String rs = "";
		for (Livro li : livros) {
			rs += li + "\n";
		}
		exibRetorno(rs);
	}

	static void ordenarValor() {
		Livro aux = new Livro();
		for (int i = 0; i < livros.size(); i++) {
			for (int j = i + 1; j < livros.size(); j++) {
				if (livros.get(j).valor < livros.get(i).valor) {
					aux = livros.get(j);
					livros.set(j, livros.get(i));
					livros.set(i, aux);
				}
			}
		}
	}

	static void listarOrdenadoPorValor() {
		ordenarValor();
		String rs = "";
		for (Livro li : livros) {
			rs += li + "\n";
		}
		exibRetorno(rs);
	}

}
