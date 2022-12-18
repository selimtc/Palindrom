import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir tamsayı yazın");
        int sayi = scanner.nextInt();

        String str = String.valueOf(sayi);
        int i = 0;
        int j = str.length() - 1;
        boolean kontrol = true;
        while (i < j) {
            if (str.charAt(i++) != str.charAt(j--)) {
                kontrol = false;
                break;
            }
        }

        if (kontrol)
            System.out.println(sayi + "  palindromdur ");
        else
            System.out.println(sayi + "  palindrom değildir");
    }
}