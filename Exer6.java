import java.util.Scanner;

public class Exer6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leitor = new Scanner(System.in);
		int x, y, z;
		
		System.out.println("Valor primeira prova:");
		x = leitor.nextInt();
		
		System.out.println("Valor segunda prova:");
		y = leitor.nextInt();
		
		System.out.println("Valor terceira prova:");
		z = leitor.nextInt();
		
		
		if(x + y + z >=7)
			System.out.println("Aprovado");
		
		
		if(x + y + z <7)
			System.out.println("Reprovado");
		
		
		
	}

}
