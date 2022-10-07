import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double raio, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira raio do circulo");
        raio = sc.nextDouble();
        area = Math.PI * Math.pow(raio, 2);
        System.out.print("A area do circulo é: ");
        System.out.format("%.2f", area);
        sc.close();
    }
}
