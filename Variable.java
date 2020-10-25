public class Variable {

    public static void main(String[] args) {
        // bilangan bulat menggunakan int
        int a,b,c ; 
        a=10;
        b=20;
        c=5;
        float d = 10.5f;
        double e = 20.12345678312312312321;

        int penjumlahan1 = a+b;
        int penjumlahan2 = penjumlahan1 + c;
        int penjumlahan3 = (int) d + (int) e;

        String penjelasan = "Hasil dari 10.5 + 20.12 = ";

        System.out.println("Hasil dari (10+20) + 5 = " + penjumlahan2);
        System.out.println(penjelasan + penjumlahan3);
    }
    
}
