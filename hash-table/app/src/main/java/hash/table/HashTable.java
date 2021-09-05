package hash.table;

import java.util.*;

public class HashTable<T> {
    Entery[] arr;
    int size;

    public HashTable(int size){
        this.size=size;
        arr=new Entery[this.size];
        for (int i=0;i<arr.length;i++){
            arr[i]=new Entery();
        }
    }
    public int Hash(int key){
        return key%size;
    }

    public int HashString(String key){
        return Integer.parseInt(key)%size;
    }
String str="";
    public void Add(int key,T value){
        int inx=Hash(key);
        Entery newArrayValue=arr[inx];
        Entery newItem=new Entery<T>(key,value);
        newItem.next=newArrayValue.next;
        newArrayValue.next=newItem;
//        System.out.println(HashTable.arr[inx].value);
        str+="\""+newItem.getKey()+":"+newItem.getValue()+"\", ";
//        System.out.print("[ "+newItem.getKey()+":"+newItem.getValue()+"]");
//        System.out.println(str);

    }
    public String show(){
       return "["+ str+"]";
    }

    public T Get(int key){
        T value=null;
        int inx=Hash(key);
        Entery arrval=arr[inx];
        while (arrval!=null){
            if(arrval.getKey()==key){
                value=(T)arrval.value;
                break;
            }
            arrval=arrval.next;

        }
        return value;
    }

    public boolean Contain(int val){
        int inx=Hash(val);
        Entery arrval=arr[inx];
        while (arrval!=null){
            if(arrval.getKey()==val){
               return true;
            }
            arrval=arrval.next;

        }
        return false;
    }
    // Code Challenge 31
    public String RepeatedWord(String sentence){
        String first=sentence.replace(",","");
        System.out.println("my line: "+first);
        String[] wordList= first.split(" ");
        System.out.println(Arrays.toString(wordList));
        Map<String,Integer> List=new HashMap<>();
        for (String word:wordList){
            Integer integer=List.get(word.toLowerCase());
            if(integer==null){
                List.put(word.toLowerCase(), 1);
            }else {
                List.put(word.toLowerCase(), integer+1);
                System.out.println(word);
                return word.toLowerCase();
            }

        }
        return null;
    }


//    @Override
//    public String toString() {
//        return "HashTable{" +
//                "arr=" + Arrays.toString(arr) +
//                ", size=" + size +
//                '}';
//    }
}
