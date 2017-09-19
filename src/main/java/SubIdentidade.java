import java.io.Serializable;

public class SubIdentidade implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer numero;
	private Integer numeroFinal;
	private Integer id;

	public SubIdentidade(Integer numero, Integer numeroFinal, Integer id) {
		super();
		this.numero = numero;
		this.numeroFinal = numeroFinal;
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public Integer getNumero() {
		return numero;
	}

	public Integer getNumeroFinal() {
		return numeroFinal;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public void setNumeroFinal(Integer numeroFinal) {
		this.numeroFinal = numeroFinal;
	}

}
