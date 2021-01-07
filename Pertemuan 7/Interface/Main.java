class Main {
    public static void main(String args[]) {
        Kucing cat = new Kucing();
        System.out.println("Suara kucing = " + cat.suaraHewan());
        System.out.println("Makanan kucing = " + cat.jenisMakanan());

        System.out.println();

        Hiu shark = new Hiu();
        System.out.println("Suara hiu = " + shark.suaraHewan());
        System.out.println("Makanan hiu = " + shark.jenisMakanan());
        System.out.println("Tipe Makanan hiu = " + shark.tipeMakanan());
        System.out.println("Jenis hiu = " + shark.tipeHewan());
        System.out.println("Tempat hidup hiu = " + shark.tipeAlam());
        shark.umurHiu(20);
    }
}