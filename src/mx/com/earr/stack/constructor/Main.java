package mx.com.earr.stack.constructor;

public class Main {
    public static void main(String[] args) {

        StackCustom myStack = new StackCustom(4);

        myStack.printAll();

        /*
            EXPECTED OUTPUT:
            ----------------
            Top: 4
            Height: 1

            Stack:
            4

        */

    }
}
