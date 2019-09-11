
public class Estoque {

	public static void main(String[] args) {
		ListaDinamica estoque = new ListaDinamica();

		estoque.adicionar("CKP10", 123.45, 10);
		estoque.adicionar("CKP20", 456.78, 20);
		estoque.adicionar("CKP30", 789.00, 30);
		estoque.exibir();
		estoque.remover(2);
		estoque.exibir();
	}

}
