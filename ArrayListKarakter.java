import java.util.ArrayList;

public class ArrayListKarakter {
    public static void main(String[] args) {
        ArrayList senjata = new ArrayList();
        senjata.add(20000);
        senjata.add("api");
        senjata.add(20);
        senjata.add("pedang");

        System.out.println("Nama senjatanya adalah = "+senjata.get(3)+
                            "\n Element senjata nya adalah = "+ senjata.get(1) +
                            "\n Harga senjatanya adalah = "+ senjata.get(0) +
                            "\n Senjata ini sudah terpakai sebanyak = "+ senjata.get(2)+"%");  
                            senjata.remove(0);

                            System.out.println("senjata");
                        }

}
