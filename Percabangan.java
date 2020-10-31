public class Percabangan {
    public static void main(String[] args) {

        // String kampus = "Lain";

        // if(kampus.equals("NF")){
        //     System.out.println("Saya Kuliaha di Kampus Lain");
        // }

        int nilai1 = 10;
        int nilai2 = 5;


        //if if akan muncul keduanya jika kalau keduanya terpenuhi
        // if(nilai1 > nilai2) {
        //     int nilai3 = nilai1+nilai2;
        //     System.out.println("Hasil pertambahan 10+5 = "+nilai3);
        // } if (nilai2 < nilai1) {
        //     int nilai4 = nilai2+15;
        //     System.out.println("Hasil pertambahan 5+15 = "+nilai4);
        // }
        
        //salah satu yg jalan
        if(nilai1 <= nilai2) {
            int nilai3 = nilai1+nilai2;
            System.out.println("Hasil pertambahan 10+5 = "+nilai3);
        }else if (nilai2 < nilai1) {
            int nilai4 = nilai2+15;
            System.out.println("Hasil pertambahan 5+15 = "+nilai4);
        }else if (nilai2 > 10) {
            int nilai3 = nilai1 + nilai2 + 10;
            System.out.println("Hasil pertambahan 10+5+10 = "+nilai3);
        }else {
            System.out.println("Tidak ada pertambahan");
        }
    }
    
}
