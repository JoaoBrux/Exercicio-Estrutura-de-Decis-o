import java.util.Scanner;

public class Exer4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leitor = new Scanner(System.in);
		int x, y;
		
		System.out.println("Digite primeiro número:");
		x = leitor.nextInt();
		
		System.out.println("Digite segundo número");
		y = leitor.nextInt();
		
		if(x>y)
			System.out.println(x);
		System.out.println(y);
		
		if(y>x)
			System.out.println(y);
		System.out.println(x);
		
		
	}

}
