package mx.com.earr.linked_list.remove_first;

public class Main {
    public static void main(String[] args) {

        LinkedListCustom myLinkedList = new LinkedListCustom(2);
        myLinkedList.append(1);

        // (2) Items - Returns 2 Node
        System.out.println(myLinkedList.removeFirst().value);
        // (1) Item - Returns 1 Node
        System.out.println(myLinkedList.removeFirst().value);
        // (0) Items - Returns null
        System.out.println(myLinkedList.removeFirst());


        /*
            EXPECTED OUTPUT:
            ----------------
            2
            1
            null

        */

    }
}
