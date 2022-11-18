package percobaan1;

public class Kucing extends Hewan {

    public Kucing(int berat) {
        super(berat);
    }

    @Override
    public void bergerak() {
        System.out.println("Berjalan dengan KAKI, \"Tap..tap..\"");
    }

    @Override
    public void beratBadan(int berat) {
        System.out.println("Berat badan kucing adalah " + berat);
    }

    @Override
    public void makan() {
        System.out.println("Kucing makan whiskas");
    }
}
