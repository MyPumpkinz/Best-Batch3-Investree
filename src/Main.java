import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama :");
        String nama = input.nextLine();
        System.out.print("Masukkan warna :");
        String warna = input.nextLine();
        System.out.print("Masukkan merk :");
        String merk = input.nextLine();
        System.out.print("Masukkan harga :");
        Double harga = input.nextDouble();
        System.out.print("Masukkan tahun keluar :");
        int tahunKeluar = input.nextInt();

        Motor mtr = new Motor(nama, warna, merk, harga, tahunKeluar);

        System.out.println("ini adalah motor " + mtr.nama + " dari " + mtr.merk + "b erwana " + mtr.warna + ", harganya Rp." + mtr.harga + " juta dan tahun keluar nya: " + mtr.tahunKeluar);
        mtr.nyalakanMesin();
        mtr.matikanMesin();
        mtr.maju();
        mtr.klakson();
        mtr.seinLampu();
    }
}