public class Mobil extends Kendaraan {
    public Mobil(String merk, String warna, int kecepatan) {
        super(merk, warna, kecepatan);
    }
    
    public void jalan() {
        System.out.println("Mobil Berjalan");
    }

    public void berhenti() {
        System.out.println("Mobil Berhenti");
    }

    public void drifting() {
        System.out.println("Mobil Drift 45 degree");
    }
}