import java.security.Key;
import java.util.*;

public class Dsa2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Integer> stack = new LinkedList<>();
        Stack<Integer> stack2 = new Stack<Integer>();


        /* Stack methods*/
        //Stack< String>  stack = new Stack< String>();

        // stack.add("Heelooo");
        // stack.add("Byyy");
        // System.out.println(stack.empty());
        // System.out.println(stack);
        // stack.pop();
        // System.out.println("After using pop Method ");
        // System.out.println(stack);

        /* Queue Data Structue */
        // Queue<String> queue = new LinkedList<String>() ;
        // System.out.println(queue.isEmpty());
        //queue.offer("karen ");
        //queue.offer(" chad");
        // queue.offer(" naaa");
        // queue.offer("arrman ");
        //    queue.poll();
        // System.out.println(queue.size());
        // System.out.println(queue.contains("lara"));   // return boolean not index
        // System.out.println(queue);


          /* Queue<Double> queue = new LinkedList<Double>();
        
               queue.offer(5.0);

               queue.offer(2.5)  ;
               queue.offer(4.5)   ;
               queue.offer(7.0)    ;
               queue.offer(9.0)     ;
               queue.offer(4.5)      ;


               while (!queue.isEmpty()){
                   System.out.println(queue.poll());
               }          */


        // Queue<double>  queue = new PriorityQueue<>(Collections.reverseOrder()) ;
        //   Queue<String>  queue = new PriorityQueue<String>(Collections.reverseOrder());

        // Linkedlist = Stores Nodes in 2 parts(data + address)
        //Nodes are in non- constructive memory location
        //Element are linked using pointers

        //advantages
        //1. iNSERTION AND DELETION ARE OF O(1)
        //2.SEARCHING TAKES TIME THAN ARRAYLIST


        //USES
        //IMPLEMENTS QUEUE AND STACK
        //GPS NAVIGATION
        //MUSIC PLAYLIST

       // LinkedList<String> linked = new LinkedList<String>();

       // linked.push("A");
        //linked.push("B");
      //
        //  linked.push("C");
       // linked.push("D");
       // linked.push("E");
       // linked.pop();

       // System.out.println(linked);

         //linkedlist as a queue

        //linked.offer("A");
        //linked.offer("B");
       // linked.offer("c");
       // linked.offer("D");
       // linked.offer("E");

       // linked.poll();

         //    linked.add(4,"G");
         //    linked.remove("A");
         //    linked.indexOf("B");
      //  System.out.println(linked.peekFirst());
      //  System.out.println(linked.peekLast());
      //  linked.addLast("z");
      //  linked.addFirst("o");
      //  linked.removeLast();
        

             //indexing of queue starts from 0 




      //  System.out.println(linked);




        // STATIC ARRAY;
        //    IN STATIC ARRAY WE CAN SEARCH ANY ELEMNT WITH O(1),SIZE DOESNT MATTER
        //SEARCHING TAKES O(N)
        //INSERTION ADN DELETION TAKES O(N)

        //DISADVANTAGE
        //SIZE FIXED

        //DYNAMIC ARRAY
        //   DYNAMIC ARRAY HAS ITS OWN STATIC ARRAY OF FIXED SIZE
        // WHEN THE CAPACITY REACHES IN DYNAMIC ARRAY IT INCREASES THE CAPACITY BY MOSTLY 2 OR 1.5


        //ADVANTAGES
        //RANDOM ACCESS ELEMENT  O(1)

        //DISADVANTAGES
               //SHIFTING ELEMENT TAKES TIME O(n)
         //INC/DEC ELEMENT TAKES O(N)

         //ArrayList<String> arrayList = new ArrayList<String>();
        LinkedList<Integer>     linked = new LinkedList<Integer> ();
        ArrayList<Integer>  arrayList = new ArrayList<Integer>();
        
         long starttime;
         long endtime;
         long elapsedtime;


         for (int i=0; i<10000000;i++){
             linked.add(i);
             arrayList.add(i);
         }
        
          starttime = System.nanoTime();
         //dosomething or peform something between these two
        //time between theese between these 2 operators

       // linked.get(0);
        //-->>8499ns for LL

        //  linked.get(50000);

        //arrayList.get(0);
        //arraylist is little faster than LL


        //endtime = System.nanoTime();
        //elapsedtime = endtime- starttime;


        //Removing at arraylist takes much time bcuz of shifting of elements
        //searching lst and 

        //System.out.println("Linkedlist:\t" +elapsedtime +" ns");


         //TIME COMPLEXITY

        // O(1) = CONSTANT TIME
          //  =  RANDOM ACCESS OF AN ELEMENT IN AN ARRAY
        // = INSERTING AT THE BEGINNING OF LINKEDLIST

        //O(LOG N ) = LOGARITHMIC TIME
        //          = BINARY SEARCH

        //O(N) = LINEAR TIME
               //= LOOPING THROUGH ELEMENTS IN AN ARRAY
               //= SEARCHING THROUGH A LINKEDLIST
        //O(n log n) = quasilinear time
                   //= quicksort
                  // = mergesort
                  //=heapsort
        //o(n^2) = quadratic time
                // insertion sort
                //selection sort
                //bubble sort

        //o(n!) = factorial sort
                //Travelling salesman problem


        //LINEAR SEARCH


        //O(N) = LINEAR TIME
        //LOOPING THROUGH ELEMENTS IN AN ARRAY
        // SEARCHING THROUGH A LINKEDLIST
        //aDVANTAGES
        // DOES NOT NEED TO SORTED
        //FAST FOR SEARCH OF SMALL TO MEDIUM DATA SETS

        //DISADVANTAGES
        //  slOW FOR LARGE DATA SETS


        //CODE

        //leaving sorting algo for later

        






        //      Hashtable

        //E<K,V>  -------> KEY AND VALUE CAN BE OF ANY TIME
        //GIVE INPUT TO HASHFUNCTION AND THEN IT DIVIDES AND THE RETURN THE REMAINDER  AS OUTPUT WITH THE CAPACITY OF HASHTABLE
        //AND RETURN THE VALUE
        //RETURN VALUE GIVES THE INDEX WHEREE THE DATA SHOULD BE PLACED IN HASHTABLE

        //IF COLLISION OCCUR THEN TURN THE BUCKET AS LINKED LIST
        //THIS METHOD IS CALLED CHAINING
        //TO DECREASE THE COLLISION ,WE MAY INCREASE THE SIZE OF THE COLLISON BUT THATS NOT SO MUCH USEFULL


      //  Hashtable<Integer, String> Table = new Hashtable<>(10,0.75f);   // ---->Giving hashtable capacity and can give float loadfactor capacity

        //Constructs a new, empty hashtable with a default initial capacity (11) and load factor (0.75).

       //once 75% of the capacity of the Hashtable filled it will  dynamically expand

        //    Table.put(180,"Bumrah");
        //    Table.put(586,"Siraj");
        //    Table.put(140,"ishan");
        //    Table.put(780,"gill");
        //    Table.put(123,"Rohit");
        //    Table.put(673,"virat");

        //    Table.remove(780) ;

            //we want to print key value pair
        //using for loop

      //  for (Integer key : Table.keySet()){
            //Table.keyset() ---------->>>>> return the set of keys
      //      System.out.println(key +"\t" + Table.get(key));
            //Table.get(key) ---------->> return the value as on the key




        //Linked list


        //  public class singlylinkedlist{

     //   public Node Head;
       // public Node Head;
         //   public Node Tail;
           // public int length;

            //{
              //  static class Node{
                //    public int value;
                  //  public Node next;

                    //Node(int value){
                      //  this.value=value;
                        //this.next = null;
                    //}
                //}
            //}






      //  }



        





    }
}