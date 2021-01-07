public class BangunDatar {
    public static void main(String args []) {
        int keliling = keliling(10);
        double kelilingkedua = keliling(5.5, 6.9);
        System.out.println("nilai keliling pertama = " + keliling);
        System.out.println("nilai keliling kedua = " + kelilingkedua);
    }

    static public int keliling(int r) {
        int nilai = 2 * r;

        return nilai;
    }

    static public double keliling(double sisi, double alas) {
        double nilai = 4 * sisi * alas;
        
        return nilai;
    }
}