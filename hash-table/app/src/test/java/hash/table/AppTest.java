/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hash.table;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    // Adding a key/value to your hashtable results in the value being in the data structure
    @Test void AddTest() {
        HashTable<String> student=new HashTable<>(5);
        student.Add(1,"baraa");
        student.Add(13,"Mohammad");
        student.Add(20,"Husain");
        student.Add(17,"Israa");
        student.Add(15,"Ghada");
        assertEquals(5, student.arr.length);
    }
    //Retrieving based on a key returns the value stored
    @Test void valueStore(){
        HashTable<String> student=new HashTable<>(5);
        student.Add(1,"baraa");
        student.Add(13,"Mohammad");
        student.Add(20,"Husain");
        student.Add(17,"Israa");
        student.Add(15,"Ghada");
        assertEquals(null, student.Get(5));
    }
  //  Retrieving based on a key returns the value stored
    @Test void ReturnTheValue(){
        HashTable<String> student=new HashTable<>(5);
        student.Add(1,"baraa");
        student.Add(13,"Mohammad");
        student.Add(20,"Husain");
        student.Add(17,"Israa");
        student.Add(15,"Ghada");
        assertEquals("Ghada", student.Get(15));
    }
    //Successfully returns null for a key that does not exist in the hashtable
    @Test void ReturnNullIf(){
        HashTable<String> student=new HashTable<>(5);
        student.Add(1,"baraa");
        student.Add(13,"Mohammad");
        student.Add(20,"Husain");
        student.Add(17,"Israa");
        student.Add(15,"Ghada");
        assertEquals(null, student.Get(5));
    }
    //Successfully handle a collision within the hashtable
    @Test void HandlingCollision(){
        HashTable<String> student=new HashTable<>(5);
        student.Add(1,"baraa");
        student.Add(13,"Mohammad");
        student.Add(20,"Husain");
        student.Add(17,"Israa");
        student.Add(15,"Ghada");
        // Hash Method return the index of each backet in linkedlist
        //Successfully retrieve a value from a bucket within the hashtable that has a collision
        //Successfully hash a key to an in-range value
        assertEquals(0, student.Hash(5));
        assertEquals(0, student.Hash(15));
    }
    //Contain Method
    @Test void ContainMethod(){
        HashTable<String> student=new HashTable<>(5);
        student.Add(1,"baraa");
        student.Add(13,"Mohammad");
        student.Add(20,"Husain");
        student.Add(17,"Israa");
        student.Add(15,"Ghada");
        assertEquals(true, student.Contain(13));
        assertEquals(false, student.Contain(23));
    }
    //Code Challenge 31


    //Happy Path Code Challenge 31
    @Test void HappyPath(){
        HashTable<String> collectWords=new HashTable<>(1);
        String sentences="Once upon a time, there was a brave princess who...";
        assertEquals("a",collectWords.RepeatedWord(sentences) );
    }
    // When we i have uppercase
    @Test void UpperCase(){
        HashTable<String> collectWords=new HashTable<>(1);
        String sentences="It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...";
        assertEquals("it",collectWords.RepeatedWord(sentences) );
    }
    // WHen the word ended by comma
    @Test void EndedByComma(){
        HashTable<String> collectWords=new HashTable<>(1);
        String sentences="It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";
        assertEquals("summer",collectWords.RepeatedWord(sentences) );
    }

    @Test void nullString(){
        HashTable<String> collectWords=new HashTable<>(1);
        String sentences="";
        assertEquals(null,collectWords.RepeatedWord(sentences) );
    }

    // Code Challenge 32

    @Test void HappypathCodeChallenge(){
        tree<Integer> new1=new tree<>();
        new1.root=new Node<>(3);
        new1.root.rightChild=new Node<>(5);
        new1.root.leftChild=new Node<>(7);
        new1.root.rightChild.leftChild=new Node<>(4);
        new1.root.rightChild.rightChild=new Node<>(9);
//        System.out.println(new1.inOrder(new1.root));

        tree<Integer> new2=new tree<>();
        new2.root=new Node<>(10);
        new2.root.rightChild=new Node<>(15);
        new2.root.leftChild=new Node<>(27);
        new2.root.rightChild.leftChild=new Node<>(4);
        new2.root.rightChild.rightChild=new Node<>(9);
        List<Integer> lastArr=new ArrayList<>();
        lastArr.add(4);
        lastArr.add(9);

        HashTable<String> collectWords2=new HashTable<>(5);
        assertEquals(lastArr, collectWords2.treeInsersection(new1,new2));
    }
    @Test void ifTheArrayHaveDublicatedValue(){
        tree<Integer> new1=new tree<>();
        new1.root=new Node<>(150);
        new1.root.rightChild=new Node<>(250);
        new1.root.leftChild=new Node<>(100);
        new1.root.leftChild.leftChild=new Node<>(200);
        new1.root.leftChild.rightChild=new Node<>(160);
        new1.root.leftChild.rightChild.rightChild=new Node<>(175);
        new1.root.leftChild.rightChild.leftChild=new Node<>(125);
        new1.root.rightChild.leftChild=new Node<>(200);
        new1.root.rightChild.rightChild=new Node<>(350);
        new1.root.rightChild.rightChild.rightChild=new Node<>(500);
        new1.root.rightChild.rightChild.leftChild=new Node<>(300);
//        System.out.println(new1.inOrder(new1.root));

        tree<Integer> new2=new tree<>();
        new2.root=new Node<>(42);
        new2.root.rightChild=new Node<>(600);
        new2.root.leftChild=new Node<>(100);
        new2.root.leftChild.leftChild=new Node<>(15);
        new2.root.leftChild.rightChild=new Node<>(160);
        new2.root.leftChild.rightChild.rightChild=new Node<>(175);
        new2.root.leftChild.rightChild.leftChild=new Node<>(125);
        new2.root.rightChild.leftChild=new Node<>(200);
        new2.root.rightChild.rightChild=new Node<>(350);
        new2.root.rightChild.rightChild.rightChild=new Node<>(500);
        new2.root.rightChild.rightChild.leftChild=new Node<>(4);
        List<Integer> lastArr=new ArrayList<>();
        lastArr.add(160);
        lastArr.add(100);
        lastArr.add(500);
        lastArr.add(200);
        lastArr.add(125);
        lastArr.add(350);
        lastArr.add(175);


        HashTable<String> collectWords2=new HashTable<>(5);
        assertEquals(lastArr, collectWords2.treeInsersection(new1,new2));
    }

    @Test void ifTheArraysIsEmpty(){
        tree<Integer> new1=new tree<>();
        tree<Integer> new2=new tree<>();
        HashTable<String> collectWords2=new HashTable<>(5);
        assertEquals(null, collectWords2.treeInsersection(new1,new2));
    }

//Code Challenge 33

    @Test void joinTwoTableHappyPath(){
        JoinHashTableImp<String , String> table1 = new JoinHashTableImp<>();
        table1.add("first" , "Baraa");
        table1.add("second" , "Yayha");
        table1.add("third" , "Mohammad");

        JoinHashTableImp<String , String> table2 = new JoinHashTableImp<>();
        table2.add("first" , "new");
        table2.add("second" , "Student");
        table2.add("third" , "In School");

        Join join=new Join();
        assertEquals("[[second, Yayha, Student], [first, Baraa, new], [third, Mohammad, In School]]",join.leftJoinHashMaps(table1, table2).toString() );
    }

    @Test void iftheTwoTablesIsEmpty(){
        JoinHashTableImp<String , String> table1 = new JoinHashTableImp<>();

        JoinHashTableImp<String , String> table2 = new JoinHashTableImp<>();


        Join join=new Join();
        assertEquals("[]",join.leftJoinHashMaps(table1, table2).toString() );
    }

    @Test void iftheOneTablesIsEmpty(){
        JoinHashTableImp<String , String> table1 = new JoinHashTableImp<>();
        table1.add("first" , "Baraa");
        table1.add("second" , "Yayha");
        table1.add("third" , "Mohammad");

        JoinHashTableImp<String , String> table2 = new JoinHashTableImp<>();

        Join join=new Join();
        assertEquals("[[second, Yayha, null], [first, Baraa, null], [third, Mohammad, null]]",join.leftJoinHashMaps(table1, table2).toString() );
    }

}
