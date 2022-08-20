package SKerns_Lab8;

public class Lab8 {

    public static void main(String[] args){
        GenericQueue<String> stringQueue = new GenericQueue<>();
        GenericQueue<Double> doubleQueue = new GenericQueue<>();
        GenericStack<String> stringStack = new GenericStack<>();
        GenericStack<Double> doubleStack = new GenericStack<>();

        stackTestString(stringStack);
        stackTestDouble(doubleStack);
        queueTestDouble(doubleQueue);
        queueTestString(stringQueue);

    }
    public static void stackTestString(GenericStack stack){
        final int FIVE = 5;
        String strPush;
        System.out.println("\n\nTesting output of String stack\n");
        System.out.println("Is the stack empty? " + stack.empty());
        System.out.println("Printing stack: " + stack);
        System.out.println("Pushing 5 strings onto the stack.");
        for (int i = 1; i <= FIVE; i++){
            strPush = "String" + i;
            stack.push(strPush);
        }
        System.out.println("Printing stack: " + stack);
        System.out.println("Pop the top value. Popped value is: "
                + stack.pop());
        System.out.println("Stack now contains: " + stack);
        System.out.println("Peek at the new top value: " + stack.peek());
        System.out.println("Printing stack: " + stack);
        System.out.println("Is the stack empty? " + stack.empty());
        System.out.println("Popping the remaining items.");
        for (int i = 1; i < FIVE; i++){
            stack.pop();
        }
        System.out.println("Stack now contains: " + stack);
        System.out.println("Is the stack empty? " + stack.empty());

    }

    public static void stackTestDouble(GenericStack stack){
        final double FIVE = 5.0;
        double doublePush;
        System.out.println("\n\nTesting output of double stack\n");
        System.out.println("Is the stack empty? " + stack.empty());
        System.out.println("Printing stack: " + stack);
        System.out.println("Pushing 5 doubles onto the stack.");
        for (double i = 1.0; i <= FIVE; i++){
            doublePush = i;
            stack.push(doublePush);
        }
        System.out.println("Printing stack: " + stack);
        System.out.println("Pop the top value. Popped value is: "
                + stack.pop());
        System.out.println("Stack now contains: " + stack);
        System.out.println("Peek at the new top value: " + stack.peek());
        System.out.println("Printing stack: " + stack);
        System.out.println("Is the stack empty? " + stack.empty());
        for (int i = 1; i < FIVE; i++){
            stack.pop();
        }
        System.out.println("Stack now contains: " + stack);
        System.out.println("Is the stack empty? " + stack.empty());
    }

    public static void queueTestDouble(GenericQueue queue) {
        final double FIVE = 5.0;
        double doubleEnqueue;
        System.out.println("\n\nTesting output of double queue\n");
        System.out.println("Is the queue empty? " + queue.empty());
        System.out.println("Printing queue: " + queue);
        System.out.println("Enqueuing 5 doubles onto the queue.");
        for (double i = 1.0; i <= FIVE; i++) {
            doubleEnqueue = i;
            queue.enqueue(doubleEnqueue);
        }
        System.out.println("Printing queue: " + queue);
        System.out.println("Dequeue the head value. Dequeued value is: "
                + queue.dequeue());
        System.out.println("Queue now contains: " + queue);
        System.out.println("Peek at the new head value: " + queue.peek());
        System.out.println("Printing queue: " + queue);
        System.out.println("Is the queue empty? " + queue.empty());
        System.out.println("Dequeueing the remaining items.");
        for (int i = 1; i < FIVE; i++){
            queue.dequeue();
        }
        System.out.println("Queue now contains: " + queue);
        System.out.println("Is the queue empty? " + queue.empty());
    }

    public static void queueTestString(GenericQueue queue) {
        final double FIVE = 5;
        String stringEnqueue;
        System.out.println("\n\nTesting output of String queue\n");
        System.out.println("Is the queue empty? " + queue.empty());
        System.out.println("Printing queue: " + queue);
        System.out.println("Enqueuing 5 Strings onto the queue.");
        for (int i = 1; i <= FIVE; i++) {
            stringEnqueue = "String" + i;
            queue.enqueue(stringEnqueue);
        }
        System.out.println("Printing queue: " + queue);
        System.out.println("Dequeue the head value. Dequeued value is: "
                + queue.dequeue());
        System.out.println("Queue now contains: " + queue);
        System.out.println("Peek at the new head value: " + queue.peek());
        System.out.println("Printing queue: " + queue);
        System.out.println("Is the queue empty? " + queue.empty());
        System.out.println("Dequeueing the remaining items.");
        for (int i = 1; i < FIVE; i++){
            queue.dequeue();
        }
        System.out.println("Queue now contains: " + queue);
        System.out.println("Is the queue empty? " + queue.empty());
    }
}
