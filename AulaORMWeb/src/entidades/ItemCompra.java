package entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "item_compra")
@IdClass(ItemCompraId.class)
public class ItemCompra {

	@Id
	@ManyToOne
	@JoinColumn(name = "compra_id")
	private Compra compra;

	@Id
	@ManyToOne
	@JoinColumn(name = "produto_id")
	private Produto produto;

	private double preco;

	public Compra getCompra() {
		return compra;
	}

	public void setCompra(Compra compra) {
		this.compra = compra;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
