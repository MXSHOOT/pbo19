class Persegi extends BangunDatar{
    double sisi;

    public Persegi (double sisi) {
        this.sisi = sisi;
    }

    @Override
    double luas() {
        double nilai = this.sisi * this.sisi;
        double nilaiKedua = super.luas * nilai();
        return nilai;
    }

    @Override
    double keliling() {
        double nilai = 4 * sisi;
        double nilaiKedua = nilai * super.keliling();
        return nilai;
    }
}
