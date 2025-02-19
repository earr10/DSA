package mx.com.earr.doubly_linked_list.exercises.reverse;

public class Main {
    public static void main(String[] args) {

        DoublyLinkedListCustom myDLL = new DoublyLinkedListCustom(1);
        myDLL.append(2);
        myDLL.append(3);
        myDLL.append(4);
        myDLL.append(5);

        System.out.println("DLL before reverse:");
        myDLL.printList();

        myDLL.reverse();

        System.out.println("\nDLL after reverse:");
        myDLL.printList();


        /*
       		EXPECTED OUTPUT:
        	----------------
            DLL before reverse:
            1
            2
            3
            4
            5

            DLL after reverse:
            5
            4
            3
            2
            1

     	*/

    }
}
