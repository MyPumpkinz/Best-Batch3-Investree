import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        var ulang = 3;

        while(ulang > 0){ //https://www.petanikode.com/perbedaan-perulangan-while-dan-do-while/
            System.out.println("1. Segitiga");
            System.out.println("2. Kubus");
            System.out.println("3. Balok");
            System.out.println("Masukkan Pilihan:");

            int choices = input.nextInt();

            if (choices == 1){
                System.out.print("Masukkan Tinggi :");
                int tinggi = input.nextInt();
                System.out.print("Masukkan Alas :");
                int alas = input.nextInt();
                System.out.print("Masukkan Sisi :");
                int sisi = input.nextInt();
                Segitiga sgt = new Segitiga(tinggi, alas, sisi);

                System.out.println(" ");
                System.out.println("1. Cari Luas");
                System.out.println("2. Cari Keliling");
                System.out.print("Masukkan Pilihan:");
                int choice = input.nextInt();

                if (choice == 1){
                    System.out.println("hasil: " + sgt.hitungLuas());
                    System.out.println(" ");
                } else {
                    System.out.println("hasil: " + sgt.hitungKeliling());
                    System.out.println(" ");
                }
            }

            else if (choices == 2){
                System.out.print("Masukkan Panjang :");
                int panjang = input.nextInt();
                System.out.print("Masukkan Tinggi :");
                int tinggi = input.nextInt();
                System.out.print("Masukkan Lebar :");
                int lebar = input.nextInt();
                Balok bl = new Balok(panjang, tinggi, lebar);
                System.out.println("hasil: " +bl.hitungVolume());
                System.out.println(" ");
            }

            else {
                System.out.print("Masukkan rusuk :");
                int rusuk = input.nextInt();
                Kubus kb = new Kubus(rusuk);
                System.out.println("Hasil: " + kb.hitungVolume());
                System.out.println(" ");
            }
            ulang--;
        }
    }
}