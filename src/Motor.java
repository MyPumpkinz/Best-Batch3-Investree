public class Motor {
    public String nama;
    public String warna;
    public String merk;
    public Double harga;
    public int tahunKeluar;

    public Motor (String nama, String warna, String merk, Double harga, int tahunKeluar){
        this.nama = nama;
        this.warna = warna;
        this.merk = merk;
        this.harga = harga;
        this.tahunKeluar = tahunKeluar;
    }

    public void nyalakanMesin(){
        System.out.println("tekan Stater");
    }

    public void matikanMesin(){
        System.out.println("lepas kunci");
    }

    public void maju(){
        System.out.println("gassssss");
    }

    public void klakson(){
        System.out.println("tit tittt");
    }

    public void seinLampu(){
        System.out.println("kiri kanan");
    }
}
