/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stack.and.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class App {
    public static void main(String[]arg) {
//        Stack stack=new Stack();
//        stack.push(5);
//        stack.push(10);
//        stack.push(15);
//        stack.push(20);
//        stack.pop();
//        stack.peek();
//        stack.show();
//        System.out.println(stack.show());
//        stack.peek();
//        System.out.println(stack.isEmpty());
//        Queue<String> new1=new Queue<>();
//        new1.enQueue("5");
//        new1.enQueue("10");
//        new1.enQueue("15");
//        System.out.println(new1.show());
//        System.out.println(new1.show());
//        System.out.println(new1.peek());
//        PseudoQueue new1=new PseudoQueue();
//        new1.enQueqe(1);
//        new1.enQueqe(2);
//        new1.enQueqe(3);
//        new1.enQueqe(4);
//        new1.enQueqe(5);
//        new1.deQueue();
//        new1.deQueue();
//        new1.deQueue();
//        new1.enQueqe(6);
//        new1.deQueue();
//        new1.deQueue();
//        new1.enQueqe(7);
//        new1.enQueqe(8);
//        System.out.println(new1.show());
//        AnimalShelter dog=new AnimalShelter();
//        dog.enqueue(new Cats("nimnim"));
//        dog.enqueue(new Dogs("mishmish"));
//        dog.deeQueue("cat");
//        dog.enqueue(animal1);
//        System.out.println(animal.name);
//        System.out.println(dog.deeQueue("cat"));
//        AnimalShelter cat=new AnimalShelter();
//        Animal animal1=new Dogs();
//        cat.enqueue(animal1);
//        cat.enqueue(animal1);
//        cat.enqueue(animal1);
//        cat.enqueue(animal1);
//        dog.show();
        String value="([{}]))";
        if (validateBrackets(value)) {
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
    public static boolean validateBrackets(String value){
        Deque<Character>stack=new ArrayDeque<Character>();
        for (int i=0;i<value.length();i++){
            char x=value.charAt(i);
            if(x =='{'||x=='('||x=='['){
                stack.push(x);
                continue;
            }
            if (stack.isEmpty())
                return false;
            char check;
            switch (x){
                case ')':
                    check=stack.pop();
                    if (check== '{'||check=='[')
                        return false;
                        break;
                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;

                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }
        return true;
    }
}
