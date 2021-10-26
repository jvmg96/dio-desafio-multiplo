import java.io.IOException;
import java.util.Scanner;

public class Classe{

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int A = Math.abs(leitor.nextInt());
        int B = Math.abs(leitor.nextInt());
        if (B > A) {
            if (B % A == 0 || B == 0 || A == 0) {
                System.out.println("Sao Multiplos");
            } else {
                System.out.println("Nao sao Multiplos");
            }
        }
        if (A > B) {
            if (A % B == 0 || B == 0 || A == 0) {
                System.out.println("Sao Multiplos");
            } else {
                System.out.println("Nao sao Multiplos");
            }
        }
    }
}