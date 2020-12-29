import java.util.HashMap;

class HashMapPertama {
    public static void main(String[] args) {
        HashMap <String, String> item = new HashMap<String, String>();

        item.put("Senjata","Pedang");
        item.put("Kekuatan","1192");
        item.put("Element","api");

        System.out.println("Senjata = "+item.get("Senjata")+
                            "\nMempunyai kekuatan sebesar = "+item.get("Kekuatan")+
                            "\nElement pedang adalah = "+item.get("Element"));
        
        item.put("Element","Air");     
        item.remove("Kekuatan");
        System.out.println("\n"+"Item nya adalah = "+item);
        System.out.println("\n"+"Ukuran Item nya = "+item.size());

        for (String i : item.keySet()) {
            System.out.println("\nItem nya adalah = "+item.get(i));
        }
    }
}
