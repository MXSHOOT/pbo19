class Main {
    @SuppressWarnings("deprecation")
    public static void main(String args[]) {
        Persegi persegi = new Persegi(5, 10, 2);
        double luasPersegi = persegi.luas();
        double luasOriginal = persegi.luasOriginal();
        double kelilingPersegi = persegi.keliling();

        System.out.println("Luas Persegi adalah = " + luasPersegi);
        System.out.println("Luas Original Bangun datar pada class Persegi adalah = " + luasOriginal);
        System.out.println("Keliling persegi adalah = " + kelilingPersegi);
        
        PersegiPanjang persegiPanjang = new PersegiPanjang(10, 5);
        double luasBangunDatar = persegiPanjang.luasBangunDatar();
        double luasPersegiPanjang = persegiPanjang.luasPersegiPanjang();

        System.out.println("Luas Bangun Datar adalah = " + luasBangunDatar);
        System.out.println("Luas Persegi Panjang adalah = " + luasPersegiPanjang);
    }
}