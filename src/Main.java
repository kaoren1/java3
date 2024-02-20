import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        var s = sc.next().toLowerCase();
        var f = s.replace(" ", "");

        char[] Array = s.toCharArray();
        char[] Final = f.toCharArray();

        for(int a = 0; a < f.length(); a++){
            if(Array[a] != Final[f.length() - a - 1]) {
                System.out.println("Строка не является палиндромом");
                break;
            }
            else{
                System.out.println("Строка является палиндромом");
            }
        }
    }
}