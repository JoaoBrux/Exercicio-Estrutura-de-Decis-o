import java.util.Scanner;

public class Exer7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leitor = new Scanner(System.in);
		String nom1, nom2;
		int idade1, idade2;
		
		System.out.println("Digite o primeiro nome:");
		nom1 = leitor.next();
		
		System.out.println("Digite primeira idade:");
		idade1 = leitor.nextInt();
		
		System.out.println("Digite o segundo nome:");
		nom2 = leitor.next();
		
		System.out.println("Digite a segunda idade:");
		idade2 = leitor.nextInt();
		
		if(idade1>idade2)
			System.out.println(nom1);
		
		
		if(idade1<idade2)
			System.out.println(nom2);
		
		
	}

}
