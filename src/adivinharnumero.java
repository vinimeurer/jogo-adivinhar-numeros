import java.util.Scanner;
import java.util.Random;

public class adivinharnumero {
    public static void main(String[] args) throws Exception {
        Scanner digitar = new Scanner (System.in);
        Random aleatorio = new Random();

        boolean certo = false;
        int chances = 10;
        int numeroEscolhido = aleatorio.nextInt(30) + 1;
        int numeroDigitado = 0;

        System.out.println("==============================");
        System.out.println("ADIVINHE O NÚMERO ESCOLHIDO");
        System.out.println("INTERVALO: 1 A 30");
        System.out.println("VOCE TEM " + chances + " CHANCES");
        System.out.println("==============================");

        while (chances > 0 && certo == false){
            System.out.print("\n\nDIGITE UM NUMERO: ");
            numeroDigitado = digitar.nextInt();
                
            if (numeroDigitado == numeroEscolhido) {
                System.out.println("==============================");
                System.out.println("        !!!PARABENS!!!");
                System.out.println("        VOCE ACERTOU");
                System.out.println("==============================");
                certo = true;

            } else if (numeroDigitado < numeroEscolhido) {
                -- chances;
                System.out.println("==============================");
                System.out.println("VALOR BAIXO, TENTE OUTRO MAIOR");
                System.out.println("RESTAM MAIS " + chances + " CHANCES");
                System.out.println("==============================");

            } else {
                -- chances;
                System.out.println("==============================");
                System.out.println("VALOR ALTO, TENTE OUTRO MENOR");
                System.out.println("RESTAM MAIS " + chances + " CHANCES");
                System.out.println("==============================");
                
            }
        }
    }
}
