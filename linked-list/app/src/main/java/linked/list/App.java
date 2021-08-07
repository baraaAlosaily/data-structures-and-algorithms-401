
package linked.list;

//create app class that will execute the the mehtod that created in the linked list
public class App {
    //    public String getGreeting() {
//        return "Hello World!";
//    }
    public static void main(String[] args) {
//        System.out.println(new App().getGreeting());
// ============Uncomment to test the functions===============
        LinkedList list=new LinkedList();
        list.insert(5);
        list.insert(3);
//        list.insert(1);
        list.insert(3);
        list.insert(5);
//        list.append(30);
//        list.append(35);
//        list.insertbefore(5,13);
//        list.insertAfter(35,16);
//        list.show();
//        list.kthFromEnd(-2);
//        System.out.println(list.includes(5));
        list.show();
       boolean cond= list.palindrome(list);
        System.out.println(cond);
    }
}
