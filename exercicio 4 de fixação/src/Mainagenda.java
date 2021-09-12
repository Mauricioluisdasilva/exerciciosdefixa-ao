import java.util.Scanner;
public class Mainagenda {
public static void main(String[]args) {
    Scanner ler = new Scanner (System.in);
    agenda a1 = new agenda();

    System.out.println("digite seu nome");
    a1.setnome = ler.nextLine();

    System.out.println("digite seu Numero");
    a1.setnumero = ler.nextLine();

    System.out.println("digite seu email");
    a1.setEmail = ler.nextLine();

    System.out.println("digite seu endereço");
    a1.setEndereço = ler.nextLine();

    }

}
