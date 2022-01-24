import java.util.Scanner;

public class View {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Model base = new Model();
		Controller func= new Controller();
		Scanner Leia = new Scanner(System.in);
		
		int menu=1;
		
		
		while(menu!=0) {
			System.out.println("|==============================================|");
			System.out.println("| 1- Soma");
			System.out.println("| 2- Subtração");
			System.out.println("| 3- Multiplicacao");
			System.out.println("| 4- Divisão");
			System.out.println("| 5- Potencia");
			menu = Leia.nextInt();
			switch(menu) {
			
			
			
			case 1:
				func.soma(base.getDigito1(), base.getDigito2());
				menu=1;
				break;
				
			case 2:
				func.subtracao(base.getDigito1(), base.getDigito2());
				menu=1;
				break;
				
			case 3:
				func.multiplicação(base.getDigito1(), base.getDigito2());
				menu=1;
				break;
				
			case 4: 
				func.divisão(base.getDigito1(), base.getDigito2());
				menu=1;
				break;
				
			case 5: 
				func.potencia(base.getDigito1(), base.getDigito2());
				menu=1;
				break;
	
}
		}
	}
}

