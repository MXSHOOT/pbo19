class Persegi extends BangunDatar {
    double sisi; 

    public Persegi(double sisi, int panjang, int lebar) {
        super(panjang, lebar);
        this.sisi = sisi;
    }

    @Override
    double luas() {
        double nilai = this.sisi * this.sisi;
        return nilai;
    }

    @Override
    double keliling() {
        double nilai = 4 * sisi;

        return nilai;
    }

    double luasOriginal() {
        double nilai = super.luas();

        return nilai;
    }
}