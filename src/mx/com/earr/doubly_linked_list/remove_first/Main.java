package mx.com.earr.doubly_linked_list.remove_first;

public class Main {

    public static void main(String[] args) {

        DoublyLinkedListCustom myDLL = new DoublyLinkedListCustom(2);
        myDLL.append(1);

        // (2) Items - Returns 2 Node
        System.out.println(myDLL.removeFirst().value);
        // (1) Item - Returns 1 Node
        System.out.println(myDLL.removeFirst().value);
        // (0) Items - Returns null
        System.out.println(myDLL.removeFirst());


        /*
            EXPECTED OUTPUT:
            ----------------
            2
            1
            null

        */

    }
}
