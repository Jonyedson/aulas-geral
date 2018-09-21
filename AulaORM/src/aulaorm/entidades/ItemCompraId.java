package aulaorm.entidades;

import java.io.Serializable;

public class ItemCompraId implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long compra;
	private Long produto;

	@Override
	public int hashCode() {
		int hashcode = compra.hashCode() + produto.hashCode();
		return hashcode;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		if (this == obj) {
			return true;
		}

		ItemCompraId other = (ItemCompraId) obj;

		if (produto == null) {
			return false;
		} else if (!produto.equals(other.produto)) {
			return false;
		}

		if (compra == null) {
			return false;
		} else if (!compra.equals(other.compra)) {
			return false;
		}

		return true;
	}

}
