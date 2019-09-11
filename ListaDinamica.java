
public class ListaDinamica {
	private No primeiro;
	private No ultimo;

	public ListaDinamica() {
		primeiro = null;
		ultimo = null;
	}
	
	public void adicionar(String codigo, double preco, int quant) {
		No novo = new No(codigo, preco, quant);

		if (primeiro == null) {
			primeiro = novo;
			ultimo = novo;
		}
		else {
			ultimo.setProximo(novo);
			ultimo = novo;
		}
	}

	public void remover(int pos) {
		No ant = null;
		No aux = primeiro;
		int i = 1;
		
		while (i < pos) {
			ant = aux;
			aux = aux.getProximo();
			i++;
		}
		
		ant.setProximo(aux.getProximo());
		aux.setProximo(null);
	}
	
	public void exibir() {
		No aux = primeiro;
		
		while (aux != null) {
			System.out.println("Código: " + aux.getProd().getCodigo());
			System.out.println("Preço: " + aux.getProd().getPreco());
			System.out.println("Quantidade: " + aux.getProd().getQuant());
			System.out.println();
			aux = aux.getProximo();
		}
	}
}
