class Main {
    public static void main(String[] args) {
        Persegi persegi = new Persegi(5);
        double LuasPersegi = persegi.luas();
        double kelilingPersegi = persegi.keliling();

        System.out.println("Luas Persegi adalah = "+LuasPersegi);
        System.out.println("Keliling Persegi adalah = "+kelilingPersegi);
        
        PersegiPanjang persegiPanjang = new PersegiPanjang(8,3);

        System.out.println(persegiPanjang.luas());
        System.out.println(persegiPanjang.keliling());
   }
}
