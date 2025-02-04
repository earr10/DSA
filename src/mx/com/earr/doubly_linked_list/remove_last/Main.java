package mx.com.earr.doubly_linked_list.remove_last;

public class Main {

    public static void main(String[] args) {

        DoublyLinkedListCustom myDLL = new DoublyLinkedListCustom(1);
        myDLL.append(2);

        // (2) Items - Returns 2 Node
        System.out.println(myDLL.removeLast().value);
        // (1) Item - Returns 1 Node
        System.out.println(myDLL.removeLast().value);
        // (0) Items - Returns null
        System.out.println(myDLL.removeLast());


    	/*
        	EXPECTED OUTPUT:
        	----------------
        	2
        	1
        	null

     	*/

    }

}
