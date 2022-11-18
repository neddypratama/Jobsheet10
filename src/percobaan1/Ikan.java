package percobaan1;

public class Ikan extends Hewan {

    public Ikan(int berat) {
        super(berat);
    }

    @Override
    public void bergerak() {
        System.out.println("Berenang dengan SIRIP, \"wush..wush\"");
    }

    @Override
    public void beratBadan(int berat) {
        System.out.println("Berat badan ikan adalah " + berat);
    }

    @Override
    public void makan() {
        System.out.println("Ikan makan pelet");
    }
}
