package CollectionFramework;
// import java.util.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;


public class L01_JavaCF1 {
    
    public static void main(String[] args) {

        //  -----   Java  Collection Framework (Module 1)  ------

        // Collection or List -> Interface
       //  ArrayList -> Concrete Class

    //    Collection<Integer> List1= new ArrayList<>();
    //    List<Integer> List2 = new ArrayList<>();
    //    ArrayList<Integer> List = new ArrayList<>();

       //collection

    // List.add(10);
    // List.add(20);
    // List.add(30);
    // List.add(40);
    // System.out.println(List);

    // List.remove(0);
    // System.out.println(List);

    // ArrayList<Integer> List2 = new ArrayList<>();
    // List2.add(101);
    // List2.add(102);
    // List.addAll(List2);
    // System.out.println(List);

    // List.removeAll(List2);
    // System.out.println(List);
    // List2.clear();
    // System.out.println("Size of List:"+ List2.size());


    // Iterator<Integer> iterator = List.iterator();
    // while(iterator.hasNext()){
    //     System.out.println("Elements :"+iterator.next());
    // }

    //List

    // ArrayList<Integer> List3 = new ArrayList<>();
    // List3.add(12);
    // List3.add(13);
    // List3.add(14);
    // System.out.println(List3.get(2));
    // System.out.println("Before set:"+List3);
    // List3.set(0,102);
    // System.out.println("After set :"+List3);

    // Object[] arr= List3.toArray();
    // for(Object obj: arr){
    //     System.out.println(obj);
    // }

    // System.out.println(List3.contains(102));

    
    // List.add(16);
    // List.add(70);
    // List.add(5);
    // System.out.println(List);
    // Collections.sort(List);
    // System.out.println("Shorted:"+List);
    //     List.add(16);


    // ArrayList<Integer> newList = (ArrayList<Integer>)List.clone();
    // System.out.println("Clone List: "+newList);

    // // List.ensureCapacity(50);
    // System.out.println(List.isEmpty());
    // System.out.println(List.indexOf(70));

    // System.out.println(List.lastIndexOf(16));

    // //LinkedList (Queue And Deque)

    // LinkedList<Integer> linked = new LinkedList<>();
    // linked.add(71);
    // linked.add(72);
    // linked.add(73);
    // linked.add(74);

    // linked.addFirst(11);
    // linked.addLast(99);
    // System.out.println(linked);

    // linked.removeFirst();
    // linked.removeLast();
    // System.out.println(linked);

    // System.out.println(linked.getFirst());
    // System.out.println(linked.getLast());

    // System.out.println(linked.peek());

    // System.out.println("Before poll :" + linked);
    // System.out.println(linked.poll());
    // System.out.println("After pool :"+linked);
    // linked.offer(75);
    // System.out.println(linked);

    //            --Stack--

    // Stack<Integer> st= new Stack<>();
    // st.push(10);
    // st.push(11);
    // st.push(12);
    // st.push(13);

    // System.out.println(st);

    // st.pop();
    // System.out.println(st);

    // System.out.println(st.peek());

    // System.out.println(st.search(10));

    // System.out.println(st.isEmpty());
    
    // Stack<Integer> st2 = new Stack<>();
    //  System.out.println(st2.isEmpty());

    }
}