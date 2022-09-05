public class Segitiga {
    //contractor
    private int tinggi;//instance var
    private int alas;
    private int sisi;
    private static final double bagi = 0.5;//constanta

    public Segitiga(int tinggi, int alas, int sisi) {
        this.tinggi = tinggi;
        this.alas = alas;
        this.sisi = sisi;
    }

    public double hitungLuas(){

        return alas * tinggi * bagi;
    }

    public double hitungKeliling(){

        return sisi * sisi * sisi;
    }
}