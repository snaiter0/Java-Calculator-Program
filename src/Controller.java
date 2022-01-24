import java.util.Scanner;

public class Controller {

	Model base = new Model();
	Scanner Leia = new Scanner(System.in);
	
	public void soma(Double digito1,Double digito2) {
		setter();
		System.out.println(digito1 + digito2);
	}
	
	public void multiplicação(Double digito1,Double digito2) {
		setter();
		System.out.println(digito1 * digito2);
	}
	
	public void divisão(Double digito1,Double digito2) {
		setter();
		System.out.println(digito1 / digito2);
	}
		
	public void subtracao(Double digito1,Double digito2) {
		setter();
		System.out.println(digito1 - digito2);
	}
	
	public void potencia(Double digito1, Double digito2) {
		setter();
		System.out.println(Math.pow(digito1, digito2));
	}

	public void setter() {
		System.out.println("Insira o primeiro valor: ");
		base.setDigito1(Leia.nextDouble());
		System.out.println("Insira o segundo valor: ");
		base.setDigito2(Leia.nextDouble());
	}

	
}
