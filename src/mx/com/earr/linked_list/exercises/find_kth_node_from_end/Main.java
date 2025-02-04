package mx.com.earr.linked_list.exercises.find_kth_node_from_end;

public class Main {
    public static void main(String[] args) {
        LinkedListCustom myLinkedList = new LinkedListCustom(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);

        int k = 2;
        int result = myLinkedList.findKthFromEnd(k).value;

        System.out.println(result); // Output: 4

        /*
            EXPECTED OUTPUT:
            ----------------
            4

        */

    }
}
