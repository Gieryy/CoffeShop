package POJO;

public class Kopi {
    private String namaKopi;
    private int Harga;
    private int idKopi;

    public Kopi(String namaKopi, int Harga, int idKopi) {
        this.namaKopi = namaKopi;
        this.Harga = Harga;
        this.idKopi = idKopi;
    }

    public String getNamaKopi() {
        return namaKopi;
    }

    public void setNamaKopi(String namaKopi) {
        this.namaKopi = namaKopi;
    }

    public int getHarga() {
        return Harga;
    }

    public void setHarga(int Harga) {
        this.Harga = Harga;
    }

    public int getIdKopi() {
        return idKopi;
    }

    public void setIdKopi(int idKopi) {
        this.idKopi = idKopi;
    }
    
    
}
