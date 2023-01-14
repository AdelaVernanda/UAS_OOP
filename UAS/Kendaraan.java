public abstract class Kendaraan {
    public String merk;
    public String warna;
    public int kecepatan;

    public Kendaraan(String merk, String warna, int kecepatan) {
        this.merk = merk;
        this.warna = warna;
        this.kecepatan = kecepatan;
    }

    public abstract void jalan();
    public abstract void berhenti();
}