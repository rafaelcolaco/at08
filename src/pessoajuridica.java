
public class pessoajuridica extends pessoa{
	private String cnpj;
	private String tipoempresa;
	public String getcnpj() {
	return cnpj;
	}
	public void setcnpj(String cnpj) {
	if (cnpj.length() > 0)
	this.cnpj = cnpj;
	}
	public String getTipoEmpresa() {
	return tipoempresa;
	}
	public void settipoempresa(String tipoempresa) {
	if (tipoempresa.length() > 0)
	this.tipoempresa = tipoempresa;
	}
	public pessoajuridica(String nome, String endereco, String cnpj, String tipoempresa) {
	super(nome, endereco);
	setcnpj(cnpj);
	settipoempresa(tipoempresa);
	}
	public pessoajuridica() {
	super();
	}
	@Override
	public String toString() {
		return "pessoajuridica [cnpj=" + cnpj + ", tipoempresa=" + tipoempresa + ", toString()=" + super.toString()
				+ "]";
	}
}
