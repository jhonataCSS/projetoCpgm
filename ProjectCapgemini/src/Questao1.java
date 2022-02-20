import java.util.*;

public class Questao1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		ArrayList <String> altura = new ArrayList<>();
		
		System.out.println("Digite um numero: ");
		int numAltura = entrada.nextInt();
		
		for (int n=0; n<numAltura; n++) {
			altura.add(" ".repeat(numAltura-n)+ "*".repeat(n+1)+"\n");
			
		}
		for (String a: altura) {
			System.out.println(a);
		}
	}

}
