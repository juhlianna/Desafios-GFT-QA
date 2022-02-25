import java.util.Scanner;

public class Encaixa_ouNao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int N = Integer.parseInt(leitor.nextLine());

		for (int i = 0; i < N; i++) {
			String n1 = leitor.next();
			String n2 = leitor.next();
            Boolean AmaiorB = ( n1.length() >= n2.length());
            var partefinal =  AmaiorB ? n1.substring((n1.length() - n2.length()), n1.length()) : "";

			if (partefinal.equals(n2))
				System.out.println("encaixa");
			else
				System.out.println("nao encaixa");
		}
    }
}
