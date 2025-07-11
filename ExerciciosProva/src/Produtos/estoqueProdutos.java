package Produtos;

import java.util.ArrayList;
import java.util.Scanner;

public class estoqueProdutos {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<listaProdutos> lista = new ArrayList<listaProdutos>();

	public static void main(String[] args) {
		int op = 0;
		do {
			op = lerInt();
			switch (op) {
			case 1:
				cadastra();
				break;
			case 2:
				buscaNome();
				break;
			case 3:
				buscaProdu();
				break;
			case 4:
				exib("Saindo do programa");
				break;
			default:
				exib("Opção incorreta");
			}
		} while (op != 4);
		
	}

	static String lerStr() {
		return sc.next();
	}

	static int lerInt() {
		return sc.nextInt();
	}

	static void menu() {
		String m = "1 - Cadastrar produtos\n" + "2 - Buscar produtos por nome\n"
				+ "3 - Mostrar produtos com mais de 10 no estoque\n" + "4 - Sair";
	}

	static void exib(String msg) {
		System.out.println(msg);
	}

	static void cadastra() {
		listaProdutos prod = new listaProdutos();

		exib("Digite o nome do produto: ");
		prod.nome = lerStr();
		exib("Digite a quantidade: ");
		prod.quantidade = lerInt();
		lista.add(prod);
		exib("Produto cadastrado com sucesso");

	}

	static void buscaNome() {
		listaProdutos prod = new listaProdutos();
		String nmBusca = "";
		String rs = "";
		exib("Qual produto você quer buscar?");
		nmBusca = lerStr();
		if (lista.equals(nmBusca)) {
			rs += nmBusca + "Quantidade: " + prod.quantidade;
		} else {
			exib("Nenhum produto encontrado");
		}
		exib(rs);

	}

	static void buscaProdu() {
		listaProdutos prod = new listaProdutos();
		String rs = "";
		exib("Produtos com mais de 10 unidades: ");
		for (listaProdutos lp : lista) {
			if (lp.quantidade > 10) {
				rs += lp.nome;
			} else {
				exib("Nenhum produto com mais de 10 unidades foi encontrado");
			}
			exib(rs);

		}

	}

}
