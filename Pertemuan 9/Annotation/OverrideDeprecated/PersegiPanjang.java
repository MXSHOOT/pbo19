class PersegiPanjang extends BangunDatar {
    double panjang = 10;
    double lebar = 20; 

    public PersegiPanjang(int panjang, int lebar) {
        super(panjang, lebar);
    }

    @Deprecated
    double luasBangunDatar() {
        return super.luas();
    }

    double luasPersegiPanjang() {
        double nilai = this.panjang * this.lebar;

        return nilai;
    } 
}