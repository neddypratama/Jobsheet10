package percobaan1;

public class Orang {
    private String nama;
    private Hewan hewanPeliharaan;

    public Orang(String nama) {
        this.nama = nama;
    }

    public void peliharaHewan(Hewan hewanPeliharaan) {
        this.hewanPeliharaan = hewanPeliharaan;
    }

    public void ajakPeliharaanJalanJalan() {
        System.out.println("Namaku " + this.nama);
        System.out.println("Hewan Peliharaan berjalan dengan cara: ");
        this.hewanPeliharaan.bergerak();
        this.hewanPeliharaan.makan();
        this.hewanPeliharaan.beratBadan(hewanPeliharaan.berat);
        System.out.println("-------------------------------");
    }
}
