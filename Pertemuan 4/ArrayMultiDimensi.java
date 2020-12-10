public class ArrayMultiDimensi {
    //berbagai baris
    public static void main(String[] args) {
        
        String [][] hero = {
            {"naruto", "sasuke", "sakura"},
            {"deku", "bakugo", "todoroku"},
            {"itadori", "fushiguro", "kugisaki"}
        };
        System.out.println(hero[1][2]);
        System.out.println(hero[2][0]);

        for(int i=0; i<hero.length; i++) {
            for(int j=0; j<hero[i].length; j++) {
                System.out.print(" Tampilkan hero barisan ke "
                                +i+" = "+hero[i][j]);
            }
            System.out.println("");
        }
    }
}
