package percobaan1;

public abstract class Hewan {
    private int umur;
    public int berat;

    protected Hewan(int berat) {
        this.umur = 0;
        this.berat = berat;
    }

    public void bertambahUmur() {
        this.umur += 1;
    }

    public abstract void bergerak();

    public abstract void beratBadan(int berat);

    public void makan() {
        System.out.println("Setiap hewan butuh makan");
    }
}
