# Challenge Summary
<!-- Description of the challenge -->
Write a function called repeated word that finds the first word to occur more than once in a string

## Whiteboard Process
<!-- Embedded whiteboard image -->
![img](./img/Repeat-Hash.png)

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
Time (O^2)
Space O(1)

## Solution
<!-- Show how to run your code, and examples of it in action -->
```
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
```

Output ===> it

