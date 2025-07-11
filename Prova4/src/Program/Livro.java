package Program;

public class Livro {
	String titulo;
	int paginas;
	double valor;

	@Override
	public String toString() {
		return "Título: " + titulo + "\n" + "Páginas: " + paginas + "\n" + "Valor: " + valor + "\n";
	}

}
