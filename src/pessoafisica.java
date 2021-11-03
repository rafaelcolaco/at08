
public class pessoafisica extends pessoa{
	private String cpf;
	private String estadocivil;
	public String getcpf() {
		return cpf;
	}
	public void setcpf(String cpf) {
	if (cpf.length() > 0)
	this.cpf = cpf;
	}
	public String getEstadocivil() {
	return estadocivil;
	}
	public void setEstadoCivil(String estadocivil) {
	if (estadocivil.length() > 0)
	this.estadocivil = estadocivil;
	}
	public pessoafisica(String nome, String endereco, String cpf, String estadocivil) {
	super(nome, endereco);
	setcpf(cpf);
	setEstadoCivil(estadocivil);
	}
	public pessoafisica() {
	super();
	}
	@Override
	public String toString() {
	return "pessoafisica [cpf=" + cpf + ", estadocivil=" + estadocivil + ", toString()=" + super.toString() + "]";
	}
}
