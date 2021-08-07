# Stacks and Queues
<!-- Short summary or background information -->
### Stack
A	stack	is	a	collection	of	objects	that	are	added	and	removed	in	”last	in,	first	out”	or	“LIFO”	order.	That is,	the	first	thing	added	is	the	last	thing	removed. For	example,	if	you	add	A,	B,	and	then	C,	then	the	first	
removed	will	be	C,	then	B,	then	A. Adding	an	item	to	a	stack	is	called	“pushing”	to	the	stack,	and	
removing	an	item	is	called	“popping”	off	of	the	stack.	You	can’t	access	anything	in	the	stack	that’s	not	on	
top	without	first	popping	off	everything	above	it

### Queue
A	queue	is	kind	of	like	the	opposite	of	a	stack.	Instead	of	having	a	“last-in,	first-out”	structure,	it	is	“firstin,	first-out”.	Inserting	A,	B,	and	then	C,	will	make	the	first	removed	A,	then	B,	then	C.	The	first	item	
inserted	is	called	the	“head”	of	the	queue,	and	the	last	item	is	the	“tail”.	You	can	think	of	a	queue	like	a	
line	at,	say,	an	amusement	park	ride.	The	first	person	to	get	in	the	line	is	the	first	person	to	get	on	the	
line.	The	last	person	in	line	will	have	to	wait	until	the	people	in	front	of	him/her	have	gone.

## Challenge
<!-- Description of the challenge -->
### Stack :-
Create a Stack class that has a top property. It creates an empty Stack when instantiated.method to push new node at top of the stack.method to remove node from item form top of stack. peak method to return top value in stack.

### Queue :-

Create a Queue class that has a front property. It creates an empty Queue when instantiated. enqueue method to add new node at back. dequeue method to remove node from front of th queue. peak method to identify front node in queue.



## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->

Regarding to big of O

- Space: O(1)
- Time: O(1)

## API
<!-- Description of each method publicly available to your Stack and Queue-->

#### Stack Methods:

1. push():adds  new node  that have  value of the top of the stack with  O(1) Time and space performance.

2. pop(): Removes  node from  top of the stack should raise exception when called on empty stack peek, and Returns the value from node from the top of the stack.

2. peek(): Returns Value of the node located at the top of the stack. Should raise exception when called on empty stack.

4. is empty(): Returns Boolean indicating whether or not the stack is empty.

#### Queue Methods:

1. enqueue():adds a new node with that value to the back of the queue with an O(1) Time performance.

2. dequeue(): Removes the node from the front of the queue. Should raise exception when called on empty queue. Returns: the value from node from the front of the queue.

3. peek(): Returns Value of the node located at the top of the queue. Should raise exception when called on empty queue.

3. is empty(): Returns Boolean indicating whether or not the queue is empty.