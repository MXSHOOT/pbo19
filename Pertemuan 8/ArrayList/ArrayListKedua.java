import java.util.ArrayList;

class ArrayListKedua {
    public static void main(String[] args) {
        ArrayList biodata = new ArrayList();
        biodata.add("Nani");
        biodata.add(20);
        biodata.add("Seorang Pelaut");

        int angka = (Integer) biodata.get(1);

        System.out.println("Nama nya adalah = "+biodata.get(0));
        System.out.println("Angka nya adalah = "+angka);

        ArrayList <Integer> umur = new ArrayList<Integer>();
        umur.add(18);
        umur.add(29);

        System.out.println(umur);
    }
}
