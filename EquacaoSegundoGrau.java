import java.util.Scanner;

public class EquacaoSegundoGrau {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Este programa resolve equações de segundo grau. Examplo abaixo:");
        System.out.println("ax\u00B2 + bx + c = 0\n");
        System.out.print("Digite o primeiro termo (a):");
        double a = scan.nextDouble();
        System.out.print("\nDigite o segundo termo (b):");
        double b = scan.nextDouble();
        System.out.print("\nDigite o segundo termo (c):");
        double c = scan.nextDouble();

        double x1 = ((-b) + Math.sqrt( Math.pow(b,2) - 4*a*c )) / (2*a);
        double x2 = ((-b) - Math.sqrt( Math.pow(b,2) - 4*a*c )) / (2*a);

        System.out.println("x = " + x1 + " e x = " + x2);

    }
}
