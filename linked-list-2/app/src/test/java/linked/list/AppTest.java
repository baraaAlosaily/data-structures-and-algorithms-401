/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linked.list;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
//<IMPORTANT NOTE!!!>
//Four tests created that compatapable with 7 tests required in our lab
class AppTest {
    //    @Test void appHasAGreeting() {
//        App classUnderTest = new App();
//        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
//    }
    // (test1) instantiate an empty linked list
    @Test void returnNull(){
        LinkedList list= new LinkedList();
        assertEquals(null,list.head);
    }
    //(test2)properly insert into the linked list
    //(test7)properly return a collection of all the values that exist in the linked list
    @Test void printAndInsertfunction(){
        LinkedList list= new LinkedList();
        list.insert(5);
        list.insert(10);
        list.insert(15);
        list.insert(20);
        list.insert(25);
        assertEquals(5,list.head.data);
        assertEquals("{5} -> {10} -> {15} -> {20} -> {25} -> Null",list.show());
    }
    //(test5)return true when finding a value within the linked list that exists
    //(test6)return false when searching for a value in the linked list that does not exist
    @Test void returnBoolean(){
        LinkedList list= new LinkedList();
        list.insert(5);
        list.insert(10);
        list.insert(15);
        list.insert(20);
        list.insert(25);
        assertEquals(true,list.includes(5));
        assertEquals(false,list.includes(3));
//        assertEquals(false,list.includes());
    }
    //test(4)The head property will properly point to the first node in the linked list
    //test(5)Can properly insert multiple nodes into the linked list
    @Test void proprtyHead(){
        LinkedList list= new LinkedList();
        list.insert(5);
        list.insert(10);
        list.insert(15);
        LinkedList list2= new LinkedList();
        list2.insert(3);
        list2.insert(5);
        list2.insert(4);
        LinkedList list3= new LinkedList();
        list3.insert(3);
        list3.insert(5);
        list3.insert(4);
        assertEquals(5,list.head.data);
        assertEquals(3,list2.head.data);
        assertEquals(3,list3.head.data);
    }
    //Code Challenge (6)
    //test 1:add a node to the end of the linked list
    @Test void addNode(){
        LinkedList list=new LinkedList();
        list.insert(5);
        list.insert(10);
        list.insert(15);
        list.append(30);
        assertEquals("{5} -> {10} -> {15} -> {30} -> Null",list.show());
    }
    //test 2:add multiple nodes to the end of a linked list
    @Test void addMutipleNote(){
        LinkedList list=new LinkedList();
        list.insert(5);
        list.insert(10);
        list.insert(15);
        list.append(28);
        list.append(33);
        list.append(36);
        assertEquals("{5} -> {10} -> {15} -> {28} -> {33} -> {36} -> Null",list.show());
    }
    //test 3: insert a node before a node located i the middle of a linked list
    @Test void insertBesfore(){
        LinkedList list=new LinkedList();
        list.insert(5);
        list.insert(10);
        list.insert(15);
        list.insertbefore(15,45);
        assertEquals("{5} -> {10} -> {45} -> {15} -> Null",list.show());

    }
    //test4 insert a node before the first node of a linked list
    @Test void insertBesforeFirstNode(){
        LinkedList list=new LinkedList();
        list.insert(5);
        list.insert(10);
        list.insert(15);
        list.insertbefore(5,45);
        assertEquals("{45} -> {5} -> {10} -> {15} -> Null",list.show());

    }
    //test 5 insert after a node in the middle of the linked list
    @Test void insertAfterNode(){
        LinkedList list=new LinkedList();
        list.insert(5);
        list.insert(10);
        list.insert(15);
        list.insert(45);
        list.insertAfter(10,35);
        assertEquals("{5} -> {10} -> {35} -> {15} -> {45} -> Null",list.show());
    }
    //test 6 insert after a last node in the middle of the linked list
    @Test void insertAfterLastNode(){
        LinkedList list=new LinkedList();
        list.insert(5);
        list.insert(10);
        list.insert(15);
        list.insert(45);
        list.insertAfter(45,35);
        assertEquals("{5} -> {10} -> {15} -> {45} -> {35} -> Null",list.show());
    }

}