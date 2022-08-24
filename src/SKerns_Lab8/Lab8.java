/*
 * Stewart Kerns
 * CPSC 5002, Seattle University
 * This is free and unencumbered software released into the public domain.
 */

package SKerns_Lab8;

/**
 * This program tests out the functions of two different data types in a
 * generic queue and a generic stack.  It prints a number of statements for
 * each to demonstrate how each method works
 *
 * @author Stewart Kerns
 * @version 1.0
 */
public class Lab8 {

    /**
     * The main method creates objects of each queue and stack data types that
     * will be tested and then calls each of the test methods to print out the
     * test results
     * @param args a String array containing the command line arguments
     */
    public static void main(String[] args){
        //create a GenericQueue object with Strings
        GenericQueue<String> stringQueue = new GenericQueue<>();
        //create a GenericQueue object with doubles
        GenericQueue<Double> doubleQueue = new GenericQueue<>();
        //create a GenericStack object with Strings
        GenericStack<String> stringStack = new GenericStack<>();
        //create a GenericStack object with doubles
        GenericStack<Double> doubleStack = new GenericStack<>();

        //test the methods of the GenericStacks
        stackTestString(stringStack);
        stackTestDouble(doubleStack);

        //test the methods of the GenericQueues
        queueTestDouble(doubleQueue);
        queueTestString(stringQueue);

    }

    /**
     * This method performs tests of the GenericStack class methods
     *
     * @param stack a GenericStack object to test
     */
    public static void stackTestString(GenericStack stack){
        //create a final int for how many times to run through a loop
        final int FIVE = 5;
        //declare a String that will be used for being pushed onto the stack
        String strPush;

        //Print a line to make it clear which method is being tested
        System.out.println("\n\nTesting output of String stack\n");

        //check if the stack is empty
        System.out.println("Is the stack empty? " + stack.empty());
        //print the contents of the stack
        System.out.println("Printing stack: " + stack);

        //push 5 strings onto the stack
        System.out.println("Pushing 5 Strings onto the stack.");
        for (int i = 1; i <= FIVE; i++){
            strPush = "String" + i;
            stack.push(strPush);
        }

        //print the current stack contents
        System.out.println("Printing stack: " + stack);

        //demonstrate popping a value and print the contents of the stack
        System.out.println("Pop the top value. Popped value is: "
                + stack.pop());
        System.out.println("Stack now contains: " + stack);

        //demonstrate peeking at the stack and show it didn't change it
        System.out.println("Peek at the new top value: " + stack.peek());
        System.out.println("Printing stack: " + stack);

        //check if the stack is empty anymore
        System.out.println("Is the stack empty? " + stack.empty());

        //pop the remaining items off the stack
        System.out.println("Popping the remaining items.");
        for (int i = 1; i < FIVE; i++){
            stack.pop();
        }

        //confirm that the stack is indeed empty
        System.out.println("Stack now contains: " + stack);
        System.out.println("Is the stack empty? " + stack.empty());
    }

    public static void stackTestDouble(GenericStack stack){
        //create a final int for how many times to run through a loop
        final double FIVE = 5.0;

        //Print a line to make it clear which method is being tested
        System.out.println("\n\nTesting output of double stack\n");

        //check if the stack is empty
        System.out.println("Is the stack empty? " + stack.empty());
        //print the contents of the stack
        System.out.println("Printing stack: " + stack);

        //push 5 doubles onto the stack
        System.out.println("Pushing 5 doubles onto the stack.");
        for (double i = 1.0; i <= FIVE; i++){
            stack.push(i);
        }

        //print the current stack contents
        System.out.println("Printing stack: " + stack);

        //demonstrate popping a value and print the contents of the stack
        System.out.println("Pop the top value. Popped value is: "
                + stack.pop());
        System.out.println("Stack now contains: " + stack);

        //demonstrate peeking at the stack and show it didn't change it
        System.out.println("Peek at the new top value: " + stack.peek());
        System.out.println("Printing stack: " + stack);

        //check if the stack is empty anymore
        System.out.println("Is the stack empty? " + stack.empty());

        //pop the remaining items off the stack
        System.out.println("Popping the remaining items.");
        for (double i = 1.0; i < FIVE; i++){
            stack.pop();
        }

        //confirm that the stack is indeed empty
        System.out.println("Stack now contains: " + stack);
        System.out.println("Is the stack empty? " + stack.empty());
    }

    public static void queueTestDouble(GenericQueue queue) {
        //create a final int for how many times to run through a loop
        final double FIVE = 5.0;

        //Print a line to make it clear which method is being tested
        System.out.println("\n\nTesting output of double queue\n");

        //check if the queue is empty and print the contents of the queue
        System.out.println("Is the queue empty? " + queue.empty());
        System.out.println("Printing queue: " + queue);

        //enqueue 5 doubles onto the queue
        System.out.println("Enqueuing 5 doubles onto the queue.");
        for (double i = 1.0; i <= FIVE; i++) {
            queue.enqueue(i);
        }

        //print the state of the queue
        System.out.println("Printing queue: " + queue);

        //perform a dequeue method and print the queue out after
        System.out.println("Dequeue the head value. Dequeued value is: "
                + queue.dequeue());
        System.out.println("Queue now contains: " + queue);

        //perform a peek on the new head and prove it doesn't change the queue
        System.out.println("Peek at the new head value: " + queue.peek());
        System.out.println("Printing queue: " + queue);

        //check if the queue is empty
        System.out.println("Is the queue empty? " + queue.empty());

        //dequeue the remaining items
        System.out.println("Dequeueing the remaining items.");
        for (int i = 1; i < FIVE; i++){
            queue.dequeue();
        }

        //print out the state of the queue and check if it's empty
        System.out.println("Queue now contains: " + queue);
        System.out.println("Is the queue empty? " + queue.empty());
    }

    public static void queueTestString(GenericQueue queue) {
        //create a final int for how many times to run through a loop
        final double FIVE = 5.0;
        //Create a String that will be enqueued
        String strEnqueue;

        //Print a line to make it clear which method is being tested
        System.out.println("\n\nTesting output of String queue\n");

        //check if the queue is empty and print the contents of the queue
        System.out.println("Is the queue empty? " + queue.empty());
        System.out.println("Printing queue: " + queue);

        //enqueue 5 Strings onto the queue
        System.out.println("Enqueuing 5 Strings onto the queue.");
        for (int i = 1; i <= FIVE; i++) {
            strEnqueue = "String" + i;
            queue.enqueue(strEnqueue);
        }

        //print the state of the queue
        System.out.println("Printing queue: " + queue);

        //perform a dequeue method and print the queue out after
        System.out.println("Dequeue the head value. Dequeued value is: "
                + queue.dequeue());
        System.out.println("Queue now contains: " + queue);

        //perform a peek on the new head and prove it doesn't change the queue
        System.out.println("Peek at the new head value: " + queue.peek());
        System.out.println("Printing queue: " + queue);

        //check if the queue is empty
        System.out.println("Is the queue empty? " + queue.empty());

        //dequeue the remaining items
        System.out.println("Dequeueing the remaining items.");
        for (int i = 1; i < FIVE; i++){
            queue.dequeue();
        }

        //print out the state of the queue and check if it's empty
        System.out.println("Queue now contains: " + queue);
        System.out.println("Is the queue empty? " + queue.empty());
    }
}
