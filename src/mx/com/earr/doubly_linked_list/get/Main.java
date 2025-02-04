package mx.com.earr.doubly_linked_list.get;

public class Main {

    public static void main(String[] args) {

        DoublyLinkedListCustom myDLL = new DoublyLinkedListCustom(0);
        myDLL.append(1);
        myDLL.append(2);
        myDLL.append(3);


        System.out.println(myDLL.get(3).value);


        /*
            EXPECTED OUTPUT:
            ----------------
            3

        */

    }
}
