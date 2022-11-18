package percobaan1;

public class Program {
    public static void main(String[] args) {
        Kucing kucingKampung = new Kucing(12);
        Ikan lumbaLumba = new Ikan(25);

        Orang ani = new Orang("Ani");
        Orang budi = new Orang("Budi");

        ani.peliharaHewan(kucingKampung);
        budi.peliharaHewan(lumbaLumba);

        ani.ajakPeliharaanJalanJalan();
        budi.ajakPeliharaanJalanJalan();
    }
}
