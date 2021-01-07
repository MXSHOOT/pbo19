class BangunDatar {
    int panjang;
    int lebar;

    public BangunDatar(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }


    protected double luas() {
        int nilai = panjang*lebar;
        return nilai;
    }

    protected double keliling() {
        int nilai = 2*(panjang+lebar);
        return nilai;
    }
}