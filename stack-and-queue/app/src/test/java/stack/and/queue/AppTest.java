/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stack.and.queue;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    // Test 1 :Can successfully push onto a stack
   @Test void pushOnStack(){
       Stack stack =new Stack();
       stack.push(5);
       assertEquals("->{5}",stack.show());
   }
   // Test 2:Can successfully push multiple values onto a stack
    @Test void pushMultiOnStack(){
        Stack newStack =new Stack();
        newStack.push(5);
        newStack.push(10);
        newStack.push(15);
        newStack.push(20);
        assertEquals("->{20}->{15}->{10}->{5}",newStack.show());
    }
    //Test3: successfully pop off the stack
    @Test void popOfStack(){
        Stack newStack =new Stack();
        newStack.push(5);
        newStack.push(10);
        newStack.push(15);
        newStack.push(20);
        newStack.pop();
        assertEquals("->{15}->{10}->{5}",newStack.show());
    }
    //Test4: successfully empty a stack after multiple pops
    @Test void emptyStackAfterMutiplePop(){
        Stack newStack =new Stack();
        newStack.push(5);
        newStack.push(10);
        newStack.push(15);
        newStack.push(20);
        newStack.pop();
        newStack.pop();
        newStack.pop();
        newStack.pop();
        assertEquals("",newStack.show());
    }
    //Test5: successfully peek the next item on the stack
    @Test void peekNextItem() throws IllegalAccessException {
        Stack newStack =new Stack();
        newStack.push(5);
        newStack.push(10);
        newStack.push(15);
        newStack.push(20);
        newStack.pop();
        newStack.peek();
        assertEquals("->{15}->{10}->{5}",newStack.show());
        assertEquals(15, newStack.top.data);
    }
    //Test7:pop or peek on empty stack raises exception
    @Test void raisesExcetion() throws IllegalAccessException {
    Stack newStack =new Stack();
    newStack.peek();
    assertEquals("",newStack.show());

    }
    // Queue
    //test 1: successfully instantiate an empty stack
    @Test void emptyStack(){
        Stack newStack =new Stack();
        assertEquals(true,newStack.isEmpty());
    }
    //test 2: successfully enqueue into a queue
    @Test void addToQueue(){
       Queue newQue=new Queue();
       newQue.enQueue(5);
       assertEquals("Front<-{5}<-Rear",newQue.show());
    }
    // test 3: successfully enqueue multiple values into a queue
    @Test void addMultiQueue(){
        Queue newQue=new Queue();
        newQue.enQueue(5);
        newQue.enQueue(10);
        newQue.enQueue(15);
        assertEquals("Front<-{5}<-{10}<-{15}<-Rear",newQue.show());
    }
    //test 4: Can successfully dequeue out of a queue the expected value
    //test 5: successfully peek into a queue, seeing the expected value
    @Test void deQueue(){
        Queue newQue=new Queue();
        newQue.enQueue(5);
        newQue.enQueue(10);
        newQue.enQueue(15);
        assertEquals(5,newQue.deQueue());
        assertEquals("Front<-{10}<-{15}<-Rear",newQue.show());
        //successfully peek into a queue, seeing the expected value
        assertEquals(10,newQue.peek());
    }
    // Can successfully empty a queue after multiple dequeues
    @Test void emptyAfterMultiDeq(){
        Queue newQue=new Queue();
        newQue.enQueue(5);
        newQue.enQueue(10);
        newQue.enQueue(15);
        newQue.deQueue();
        newQue.deQueue();
        newQue.deQueue();
        assertEquals("Front<-Rear",newQue.show());
    }
    //Can successfully instantiate an empty queue
    @Test void emptyque(){
        Queue newQue=new Queue();
        assertEquals("Front<-Rear",newQue.show());
    }
    // Calling dequeue or peek on empty queue raises exception
    @Test void isEmpty(){
        Queue newQue=new Queue();
        assertEquals(true,newQue.isEmpty());
    }
    //Code Challege 11
    //HappyPath
    @Test void PesudoQueue(){
        PseudoQueue new1=new PseudoQueue();
        new1.enQueqe(1);
        new1.enQueqe(2);
        new1.enQueqe(3);
        new1.enQueqe(4);
        assertEquals("->{4}->{3}->{2}->{1}",new1.show());
    }
    @Test void enqueueInPesudo(){
        PseudoQueue new1=new PseudoQueue();
        new1.enQueqe(1);
        new1.enQueqe(2);
        new1.enQueqe(3);
        new1.enQueqe(4);
        new1.enQueqe(5);
        assertEquals("->{5}->{4}->{3}->{2}->{1}",new1.show());
    }
    @Test void dequeueInPesudo(){
        PseudoQueue new1=new PseudoQueue();
        new1.enQueqe(1);
        new1.enQueqe(2);
        new1.enQueqe(3);
        new1.enQueqe(4);
        new1.enQueqe(5);
        new1.deQueue();
        assertEquals("->{5}->{4}->{3}->{2}",new1.show());
    }
    //
    @Test void enQueueandDequeueandQueue(){
        PseudoQueue new1=new PseudoQueue();
        new1.enQueqe(1);
        new1.enQueqe(2);
        new1.enQueqe(3);
        new1.enQueqe(4);
        new1.enQueqe(5);
        new1.deQueue();
        new1.enQueqe(6);
        new1.deQueue();
        assertEquals("->{6}->{5}->{4}->{3}",new1.show());
    }
    //If Queue is empty
    @Test void isEmpty2(){
        PseudoQueue new1=new PseudoQueue();
        new1.enQueqe(1);
        new1.enQueqe(2);
        new1.enQueqe(3);
        new1.enQueqe(4);
        new1.deQueue();
        new1.deQueue();
        new1.deQueue();
        new1.deQueue();
        assertEquals("",new1.show());
    }
    //Code Challenge 12

    //Happy PAth
    //enque Multi list
    @Test void enqueueAnimals(){
       AnimalShelter pets=new AnimalShelter();
       Animal animal=new Dogs();
       Animal animal1=new Cats();
       pets.enqueue(animal);
       pets.enqueue(animal1);
       pets.enqueue(animal);
        pets.enqueue(animal);
        pets.enqueue(animal1);
        assertEquals("{Front<-{dog}<-{dog}<-{dog}<-Rear}\n" +
                "{Front<-{cat}<-{cat}<-Rear}",pets.toString());
    }
    @Test void dequeueAnimals(){
        AnimalShelter pets=new AnimalShelter();
        Animal animal=new Dogs();
        Animal animal1=new Cats();
        pets.enqueue(animal);
        pets.enqueue(animal1);
        pets.enqueue(animal);
        pets.enqueue(animal);
        pets.enqueue(animal1);
        pets.deeQueue("cat");
        pets.deeQueue("dog");
        assertEquals("{Front<-{dog}<-{dog}<-Rear}\n" +
                "{Front<-{cat}<-Rear}",pets.toString());
    }
    //Create Empty list
    @Test void emptyList(){
        AnimalShelter pets=new AnimalShelter();
        Animal animal=new Dogs();
        Animal animal1=new Cats();
        assertEquals(null,pets.toString());
    }
//Dequeue last item
    @Test void dequeueLastnode(){
        AnimalShelter pets=new AnimalShelter();
        Animal animal=new Dogs();
        Animal animal1=new Cats();
        pets.enqueue(animal);
        pets.enqueue(animal1);
        pets.deeQueue("cat");
        pets.deeQueue("dog");
        assertEquals(null,pets.toString());
    }
    //dequeue different pref
    @Test void differentPref(){
        AnimalShelter pets=new AnimalShelter();
        Animal animal=new Dogs();
        Animal animal1=new Cats();
        pets.enqueue(animal);
        pets.enqueue(animal1);
        pets.deeQueue("cat");
        pets.deeQueue("bird");
        assertEquals("{Front<-{dog}<-Rear}\n" +
                "{Front<-Rear}",pets.toString());
    }

}
