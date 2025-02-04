package mx.com.earr.doubly_linked_list.append;

public class Main {

    public static void main(String[] args) {

        DoublyLinkedListCustom myDLL = new DoublyLinkedListCustom   (1);
        myDLL.append(2);

        myDLL.printAll();


        /*
       		EXPECTED OUTPUT:
        	----------------
        	Head: 1
        	Tail: 2
        	Length: 2

        	Doubly Linked List:
        	1
        	2

     	*/

    }

}
