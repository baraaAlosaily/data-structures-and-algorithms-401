/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stack.and.queue;

public class App {
    public static void main(String[]arg) {
//        Stack stack=new Stack();
////        stack.push(5);
////        stack.push(10);
////        stack.push(15);
////        stack.push(20);
////        stack.pop();
//        stack.peek();
//        stack.show();
//        System.out.println(stack.show());
//        stack.peek();
//        System.out.println(stack.isEmpty());
        Queue new1=new Queue();
        new1.enQueue(5);
        new1.enQueue(10);
        new1.enQueue(15);
        System.out.println(new1.deQueue());
        new1.show();
        System.out.println(new1.show());
        System.out.println(new1.peek());



    }

}
