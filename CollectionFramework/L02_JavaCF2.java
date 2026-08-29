package CollectionFramework;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class L02_JavaCF2 {
    public static void main(String[] args) {

        // -----Java Collection Framework (Module 2)-----
        
        // Queue<Integer> q= new LinkedList<>();

        // q.add(10);
        // q.add(20);
        // q.add(30);
        // System.out.println(q);

        // q.offer(10);
        // q.offer(20);
        // q.offer(30);
        // System.out.println(q);

        // System.out.println(q.peek());

        // q.poll();
        // System.out.println(q);

        //    Deque = Double Ended Queue

        // Deque<Integer> q = new ArrayDeque<>();
        // q.offer(10);
        // q.offerFirst(5);
        // q.offerLast(50);
        // System.out.println(q);

        // Queue<Integer> a = new ArrayDeque<>();
        // a.offer(11);
        // a.offer(12);
        // a.offer(13);
        // System.out.println("Queue : "+a);
        // a.poll();
        // System.out.println("Queue Remove :"+a);

        // Deque<Integer> ad = new ArrayDeque<>();
        // ad.push(11);
        // ad.push(12);
        // ad.push(13);
        // System.out.println("Deque :"+ad);
        // ad.pop();
        // System.out.println("Deque Remove: "+ad);

        // Queue<Integer> pq = new PriorityQueue<>();

        // pq.offer(40);
        // pq.offer(30);
        // pq.offer(20);
        // pq.offer(10);
        // System.out.println("Proirity Queue :"+ pq);
        // pq.poll();
        // System.out.println("PQ Remove :"+pq);

        //    ---- Java Set Interface----
        
        // HashSet

        Set<Integer> set1 = new HashSet<>();

        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        System.out.println(set1);
        System.out.println(set2);

        set1.retainAll(set2);
        System.out.println(set1);
        set2.retainAll(set1);
        System.out.println(set2);

        System.out.println(set2.containsAll(set1));

        // LinkedHashSet

        Set<Integer> st = new LinkedHashSet<>();

        st.add(10);
        st.add(20);
        st.add(30);
        st.add(40);
        System.out.println("LinkedHashSet" +st);

        // TreeSet

        Set<Integer> ts = new TreeSet<>();
        ts.add(40);
        ts.add(30);
        ts.add(20);
        ts.add(10);
        System.out.println("TreeSet"+ ts);

        // HashSet -> O(1)
        // LinkedHashSet -> O(n)
        // TreeSet -> BST -> O(log n)

    }
}