
public class Controller {

	Model base = new Model();
	
	public void soma(Double digito1,Double digito2) {
		System.out.println(digito1 + digito2);
	}
	
	public void multiplicação(Double digito1,Double digito2) {
		System.out.println(digito1 * digito2);
	}
	
	public void divisão(Double digito1,Double digito2) {
		System.out.println(digito1 / digito2);
	}
		
	public void subtracao(Double digito1,Double digito2) {
		System.out.println(digito1 - digito2);
	}
	
	public void potencia(Double digito1, Double digito2) {
		
		System.out.println(Math.pow(digito1, digito2));
	}


	
}
