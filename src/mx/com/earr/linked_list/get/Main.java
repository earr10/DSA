package mx.com.earr.linked_list.get;

public class Main {

    public static void main(String[] args) {

        LinkedListCustom myLinkedList = new LinkedListCustom(0);
        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(3);


        System.out.println(myLinkedList.get(3).value);


        /*
            EXPECTED OUTPUT:
            ----------------
            3

        */

    }

}
