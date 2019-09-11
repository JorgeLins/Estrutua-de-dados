
public class No {
	Produto prod;
	private No proximo;
	
	public No(Produto prod) {
		this.prod = prod;
		this.proximo = null;
	}

	public No(String codigo, double preco, int quant) {
		prod = new Produto();
		this.prod.setCodigo(codigo);
		this.prod.setPreco(preco);
		this.prod.setQuant(quant);
		this.proximo = null;
	}

	public Produto getProd() {
		return prod;
	}

	public void setProd(Produto prod) {
		this.prod = prod;
	}

	public No getProximo() {
		return proximo;
	}

	public void setProximo(No proximo) {
		this.proximo = proximo;
	}
}
