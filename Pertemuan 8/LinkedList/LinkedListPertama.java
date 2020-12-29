import java.util.LinkedList;

class LinkedListPertama {
    public static void main(String[] args) {
        LinkedList item = new LinkedList();

        item.add("Pedang");
        item.addLast(120);

        System.out.println("Item pertama = "+item.getFirst());
        System.out.println("Item terakhir = "+item.getLast());

        item.removeFirst();
        System.out.println("Item pertama = "+item.getFirst());

        item.removeLast();
        System.out.println("Item terakhir = "+item.getLast());
    }
}
