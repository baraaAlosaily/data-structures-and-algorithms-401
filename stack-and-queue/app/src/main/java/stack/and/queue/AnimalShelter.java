package stack.and.queue;

public class AnimalShelter{
    Queue dogs=new Queue();
    Queue cats=new Queue();

    public void enqueue(Animal animal){
       if( animal instanceof Dogs){
           dogs.enQueue(animal);
       }
       if(animal instanceof Cats){
           cats.enQueue(animal);
       }
    }
    public String deeQueue(String pref){
        if(pref=="cat"){
            if(!this.cats.isEmpty()){
                this.cats.deQueue();
                return "cat";
            }
        }
        else if(pref=="dog"){
            if(!this.dogs.isEmpty()){
                this.dogs.deQueue();
                return "dog";
            }
        }
        return null;
    }
//    public String show(){
//        String str="";
//        if(!this.cats.isEmpty()){
//            System.out.println(cats.toString());
//            str=str+this.cats;
//        }else if(!this.dogs.isEmpty()){
//            str=str+this.dogs;
//        }
//        System.out.println("str"+str);
//        return str;
//    }
    @Override
    public String toString(){
        if(this.cats.isEmpty()&&this.dogs.isEmpty()){
            return null;
        }
        System.out.println("{"+this.dogs.show()+"}"+"{"+this.cats.show()+"}");
        return "{"+dogs.show()+"}\n"+"{"+cats.show()+"}";
    }
}
