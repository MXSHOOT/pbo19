class Main {
    public static void main(String args[]) {
        Persegi persegi = new Persegi(5, 10, 2);
        double luasPersegi = persegi.luas();
        double kelilingPersegi = persegi.keliling();

        System.out.println("Luas Persegi adalah = " + luasPersegi);
        System.out.println("Keliling persegi adalah = " + kelilingPersegi);

        PersegiPanjang persegiPanjang = new PersegiPanjang(10, 5);
        PersegiPanjang.setPanjang(30);
        // PersegiPanjang.panjang = 10;

        double luasBangunDatar = persegiPanjang.luasBangunDatar();
        double luasPersegiPanjang = persegiPanjang.luasPersegiPanjang();

        System.out.println("Luas Bangun Datar adalah = " + luasBangunDatar);
        System.out.println("Luas Persegi Panjang adalah = " + luasPersegiPanjang);
    }
}