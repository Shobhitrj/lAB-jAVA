import java.util.*;

public class Collection {
    public static void main(String[] args) {
        ArrayList<String> studentname = new ArrayList<>();
        studentname.add("Shobhit");

        //lit in an interface which have 0th index startinh \
        //we can change Arraylist to linkedlist but there will be no change
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.addAll(list);
        list.get(0);
        System.out.println(list);
        list.remove(Integer.valueOf(0));


        Stack<String > animals = new Stack<>();
        animals.push("Dog");
//QUEUE
        Queue<Integer> queue = new LinkedList<>();
        queue.add(12);
        queue.offer(34);
        System.out.println(queue);


        //LEARN PRIORITY QUEUE
        //IT IS ALSO A CLASS
        PriorityQueue<Integer>  pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(40);
        pq.offer(20);


        //ArrayDeque





        //set
        //no duplicate element
        //if we print the set then the order can vary

        //Set<Integer> set = new HashSet<>();

         // in linkedhashset the element will be in order
        //Set<Integer> set = new LinkedHashSet<>();


          Set<Integer> set = new TreeSet<>();
          //Treeset uses the same propert of hashset but the element are in sorted manner
        set.add(34);
        set.add(3674);
        set.add(54);
        set.add(3);
        set.add(367);

        set.add(55);
        //we cannot add same element again in the set
        set.remove(3);
        //contains return boolean value
        set.contains(34);
        set.isEmpty();
        set.size();
        set.clear();


        System.out.println(set);


        //Hashmap has key value pair
        //in hashmap there are multiple types of classes treemap and hashmap
        //keys cannot be the same but the value could be same
        Map<String,Integer> numbers = new HashMap<>();
        numbers.put("One ", 1);
        numbers.put("Two", 2);
        numbers.put("Three ",3);
        if(!numbers.isEmpty()){
            numbers.put("Two",34);
        }





    }
}
