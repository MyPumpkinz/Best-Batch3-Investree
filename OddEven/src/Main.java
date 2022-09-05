import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] number = {1,2,3,4,5,6};

        System.out.println("Bilangan Ganjil");
        for(int i = 0; i < number.length; i++) {
            if (number[i] % 2 != 0) {
                System.out.println(number[i]);
            }
        }

        System.out.println("Bilangan Genap");
        for(int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0) {
                System.out.println(number[i]);
            }
        }
    }
}