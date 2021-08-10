# Challenge Summary
<!-- Description of the challenge -->
Create method that accept animals from two type and shelter (seperate ) them to two list one for cats and one for dogs by  using first in first out principle

## Whiteboard Process
<!-- Embedded whiteboard image -->
![link](./img/AnimalShelter.png)

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
Space O(1)
Time O(1)

## Solution
<!-- Show how to run your code, and examples of it in action -->
```
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
```
"{Front<-{dog}<-Rear}" 
"{Front<-Rear}"

