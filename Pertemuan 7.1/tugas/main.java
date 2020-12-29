class main {
    public static void main(String[] args) {
        Uang j = new Uang();
        EnkapulasiPembeli EP = new EnkapulasiPembeli();
        EnkapulasiBarang EB = new EnkapulasiBarang();
        EP.MerubahNamaPembeli("Helmest");
        EB.MerubahNamaBarang("Selemut");
        int beliDuaKali = beli(250000);
        double beliLebih = beli(250000,3);
        int penguranganDuaKali = j.Uang() - beliDuaKali;
        double penguranganLebih = j.Uang() - beliLebih;
        System.out.println("-------------------------------------------------");
        System.out.println("----------------DATA DIRI------------------------");
        System.out.println("-------------------------------------------------");
        System.out.println("Nama Pembeli = "+EP.getNamaPembeli());
        System.out.println("Nama Barang yang dibeli = "+EB.getNamaBarang());
        System.out.println("Uang Sekarang = "+j.Uang());
        System.out.println("-------------------------------------------------");
        System.out.println("----------------DATA BELI 2----------------------");
        System.out.println("-------------------------------------------------");
        System.out.println("Harga jika beli 2 = "+beliDuaKali);
        System.out.println("Jika dikurang Uang sekarang = "+penguranganDuaKali);
        System.out.println("-------------------------------------------------");
        System.out.println("----------------DATA BELI LEBIH------------------");
        System.out.println("-------------------------------------------------");
        System.out.println("Harga jika beli lebih = "+beliLebih);
        System.out.println("Jika dikurang Uang sekarang = "+penguranganLebih);
        System.out.println("-------------------------------------------------");
    }

    static public int beli(int n) {
        int nilai = n * 2;
        return nilai;
        }

    static public double beli(double n, double lebih) {
        double nilai = n * lebih;
        return nilai;
        }
       
}
