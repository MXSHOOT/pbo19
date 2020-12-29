import java.util.ArrayList;

class ArrayListPertama {
    public static void main(String[] args) {
        
        ArrayList item = new ArrayList();

        item.add("Yanto");
        item.add(20);
        item.add(3.2);
        item.add("Sudah Dewasa");

        int hasil = (Integer) item.get(1);

        System.out.println("Nama = "+item.get(0)+
                            "\nUmur = "+hasil+
                            "\nIPK = "+item.get(2)+"%"+
                            "\nStatus = "+item.get(3));
        item.set(3, "Belum Dewasa");
        
        item.remove(2);
        System.out.println("\n"+item);
        System.out.println(item.isEmpty());
    }
}
