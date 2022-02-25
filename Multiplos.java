import java.io.IOException;
import java.util.Scanner;

public class Classe{
    
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        //continue a solucao
        int A  = leitor.nextInt();
        int B  = leitor.nextInt();
        if (A % B == 0 || B % A == 0 )  {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
    }
    
}
