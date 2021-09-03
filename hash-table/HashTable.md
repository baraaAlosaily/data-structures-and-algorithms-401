# Hash Table

Data Structure to handle key-value pairs

## Challenge
<!-- Description of the challenge -->
Implemention hash table with the following methods:

Add :
    - Arguments: key, value
    - Returns: nothing
    - This method should hash the key, and add the key and value pair to the table, handling collisions as needed.

get : 
    - Arguments: key
    - Returns: Value associated with that key in the table

contains :
    - Arguments: key
    - Returns: Boolean, indicating if the key exists in the table already.

hash :
    - Arguments: key
    - Returns: Index in the collection for that key


## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
    Add: this method was craeted to check first if there will be a collision (same key) and handle appropriately the addition of the new key-value pair. Time complexity is O(1).

    Get: this mehtod was to return the value of the given key after using the hash function to check the map. Time compexity is O(1).

    hash: Time complexity is O(1).

    contains: this method is to first use the hash function to hash the given key and use it to check the map if it returns not null. Time complexity is O(1).


## API
<!-- Description of each method publicly available in each of your hashtable -->

* public void add(int key, T value)

* public String get(int key)

