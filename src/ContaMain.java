

public class ContaMain {

	public static void main(String[] args) {
	
		
		ContaSimples cs = new ContaSimples("Caixa", 456, 654, 100);
		System.out.println(cs.depositoPoupanca(-40000));
		System.out.println(cs.saquePoupanca(-40000));
		//System.out.println(cs.saquePoupanca(30000));
		System.out.println(cs);
		
		
	
		

	}

}
