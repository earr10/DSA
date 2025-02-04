package mx.com.earr.linked_list.set;

public class Main {

    public static void main(String[] args) {

        LinkedListCustom myLinkedList = new LinkedListCustom(0);
        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(3);

        System.out.println("Linked List before set():");
        myLinkedList.printList();

        myLinkedList.set(2, 99);

        System.out.println("\nLinked List after set():");
        myLinkedList.printList();


        /*
            EXPECTED OUTPUT:
            ----------------
            Linked List before set():
            0
            1
            2
            3

            Linked List after set():
            0
            1
            99
            3

        */

    }

}
