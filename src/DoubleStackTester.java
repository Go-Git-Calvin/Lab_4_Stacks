/**
 * DoubleStackTester.java
 * <p/>
 * Calvin Wong
 * <p/>
 * The DoubleStackTester class tests the DoubleStack class with print statements in a main method.
 */
public class DoubleStackTester {

    public static void main(String[] args) {

        DoubleStack doubleStack = new DoubleStack(8);

        doubleStack.push(1, "Dog");
        doubleStack.push(1, "Cat");
        doubleStack.push(1, "Mouse");
        doubleStack.push(1, "Lizard");
        doubleStack.push(1, "Tiger");
        doubleStack.push(2, "Fish");
        doubleStack.push(2, "Horse");
        doubleStack.push(2, "Bird");

        System.out.println("After pushing 5 items onto stack 1 and 3 items onto stack 2:");
        System.out.println(doubleStack.getStackValues(1));
        System.out.println(doubleStack.getStackValues(2));


        System.out.println("Top values of each stack: ");
        System.out.println("Stack 1: " + doubleStack.topValue(1));
        System.out.println("Stack 2: " + doubleStack.topValue(2));


        doubleStack.push(1, "Snake");
        doubleStack.push(2, "Sea Horse");
        doubleStack.push(2, "Rabbit");

        System.out.println();
        System.out.println("After trying to push 1 item onto stack 1 and 2 items onto stack 2 when stacks already full:");
        System.out.println(doubleStack.getStackValues(1));
        System.out.println(doubleStack.getStackValues(2));


        doubleStack.pop(1);
        doubleStack.pop(1);
        doubleStack.pop(2);

        System.out.println();
        System.out.println("After popping 2 items off stack 1 and 1 item off of stack 2:");
        System.out.println(doubleStack.getStackValues(1));
        System.out.println(doubleStack.getStackValues(2));


        System.out.println("The lengths of the 2 stacks:");
        System.out.println("Stack 1: " + doubleStack.length(1));
        System.out.println("Stack 2: " + doubleStack.length(2));
        System.out.println();


        doubleStack.clear(1);
        doubleStack.clear(2);
        System.out.println("After clearing the 2 stacks:");
        System.out.println("Stack 1 length: " + doubleStack.length(1));
        System.out.println("Stack 2 length: " + doubleStack.length(2));
    }
} // end of class