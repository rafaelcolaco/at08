
public class contaespecial extends Conta {

	private int diassemjuros;
	private  double limite;
	public int getdiassemjuros() {
	return diassemjuros;
	}
	public void setdiassemjuros(int diassemjuros) {
	if (diassemjuros > 0)
		this.diassemjuros = diassemjuros;
	}
	public double getlimite() {
	return limite;
	}
	public void setlimite(double limite) {
	if (limite > 0)
		this.limite = limite;
	}
	public contaespecial(String banco, int agencia, int numeroconta, double saldo, int diasSemJuros, double limite) {
	setdiassemjuros(diassemjuros);
	setlimite(limite);
	}
	public contaespecial() {
	super();
	}
	@Override
	public String toString() {
		return "contaespecial [diassemjuros=" + diassemjuros + ", limite=" + limite + ", getdiassemjuros()="
				+ getdiassemjuros() + ", getlimite()=" + getlimite() + ", getBanco()=" + getBanco() + ", getAgencia()="
				+ getAgencia() + ", getNumeroconta()=" + getNumeroconta() + ", getSaldo()=" + getSaldo() + "]";
	}
}
