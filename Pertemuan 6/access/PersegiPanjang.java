class PersegiPanjang extends BangunDatar {
    private double panjang = 10;
    private double lebar = 20; 

    public PersegiPanjang(int panjang, int lebar) {
        super(panjang, lebar);
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getPanjang() {
        return this.panjang;
    }

    double luasBangunDatar() {
        return super.luas();
    }

    double luasPersegiPanjang() {
        double nilai = this.panjang * this.lebar;

        return nilai;
    } 
}