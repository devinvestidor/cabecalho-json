import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Identidade implements Serializable {

	private static final long serialVersionUID = 1L;

	@SerializedName("Identidade")
	private List<SubIdentidade> subEntidades;

	public Identidade(List<SubIdentidade> subEntidades) {
		super();
		this.subEntidades = subEntidades;
	}

	public List<SubIdentidade> getSubEntidades() {
		return subEntidades;
	}

	public void setSubEntidades(List<SubIdentidade> subEntidades) {
		this.subEntidades = subEntidades;
	}

}
