package POJO;

public class Transaksi {
    private Admin namaAdmin;
    private Kopi Harga;
    private Kopi namaKopi;
    private String Tanggal;

    public Transaksi(Admin namaAdmin, Kopi Harga, Kopi namaKopi, String Tanggal) {
        this.namaAdmin = namaAdmin;
        this.Harga = Harga;
        this.namaKopi = namaKopi;
        this.Tanggal = Tanggal;
    }

    public Admin getNamaAdmin() {
        return namaAdmin;
    }

    public void setNamaAdmin(Admin namaAdmin) {
        this.namaAdmin = namaAdmin;
    }

    public Kopi getHarga() {
        return Harga;
    }

    public void setHarga(Kopi Harga) {
        this.Harga = Harga;
    }

    public Kopi getNamaKopi() {
        return namaKopi;
    }

    public void setNamaKopi(Kopi namaKopi) {
        this.namaKopi = namaKopi;
    }

    public String getTanggal() {
        return Tanggal;
    }

    public void setTanggal(String Tanggal) {
        this.Tanggal = Tanggal;
    }
    
}
