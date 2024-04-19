import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj rozmiar kwadratu: ");
        int size = scanner.nextInt();
        System.out.print("Podaj symbol: ");
        char symbol = scanner.next().charAt(0);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
                    System.out.print(symbol);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}