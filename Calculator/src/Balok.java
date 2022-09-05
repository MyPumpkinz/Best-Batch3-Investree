public class Balok {

    private int panjang;
    private int lebar;
    private int tinggi;

    public Balok(int panjang, int lebar, int tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public int hitungVolume(){

        return panjang * lebar * tinggi;
    }
}