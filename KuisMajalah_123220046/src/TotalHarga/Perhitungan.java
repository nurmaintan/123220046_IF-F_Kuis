package TotalHarga;

/**
 *
 * @author Lab Informatika
 */
public class Perhitungan {
    
    private int harga, jumlah;

    public Perhitungan(int harga, int jumlah) {
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public int getHarga() {
        return harga;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    
    public int hargaTotal() {
        return harga*jumlah;
    }
    
}
