
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
        list.insert(10);
        list.insert(15);
        list.insert(20);
        list.insert(25);
        list.append(30);
        list.append(35);
        list.insertbefore(5,13);
        list.insertAfter(35,16);
        list.show();
        System.out.println(list.includes(5));
    }
}
