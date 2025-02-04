package mx.com.earr.linked_list.exercises.has_loop;

public class Main {
    public static void main(String[] args) {

        LinkedListCustom myLinkedList = new LinkedListCustom(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);

        // create a loop by connecting the tail to the second node
        myLinkedList.getTail().next = myLinkedList.getHead().next;


        System.out.println("Has Loop:");
        System.out.println( myLinkedList.hasLoop());


        /*
            EXPECTED OUTPUT:
            ----------------
            Has Loop:
            true

        */

    }
}
