import java.util.Stack;

class StackPertama {
    public static void main(String[] args) {
        Stack<String> stk = new Stack<String>();

        stk.push("Farah");
        stk.push("Billah");
        stk.push("Nissa");

        System.out.println("Stack = "+stk);
        System.out.println("Stack paling atas adalah = "+stk.peek());

        System.out.println("Posisi Farah ada di = "+stk.search("Farah"));

        stk.pop();
        System.out.println("Stack = "+stk);
    }
}
