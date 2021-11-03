
public class pessoa {
	private String nome;
	private String endereco;
	public String getnome() {
	return nome;
	}
	public void setnome(String nome) {
	if (nome.length() > 0) {
	this.nome = nome;
	}
	}
	public String getendereco() {
	return endereco;
	}
	public void setEndereco(String endereco) {
	if (endereco.length() > 0) {
	this.endereco = endereco;
	}
	}
	public pessoa(String nome, String endereco) {
	setnome(nome);
	setEndereco(endereco);
	}
	public pessoa() {
	}
	@Override
	public String toString() {
		return "pessoa [nome=" + nome + ", endereco=" + endereco + "]";
	}
}
