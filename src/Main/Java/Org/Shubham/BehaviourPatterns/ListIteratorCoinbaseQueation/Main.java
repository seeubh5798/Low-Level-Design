package Main.Java.Org.Shubham.BehaviourPatterns.ListIteratorCoinbaseQueation;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        l1.add(1);
        l1.add(2);
        l2.add(3);
        l2.add(4);

        Iterator<Integer> i1 = l1.iterator();
        Iterator<Integer> i2 = l2.iterator();

        Queue<Iterator<Integer>> q = new LinkedList<>();

        q.add(i1);
        q.add(i2);
        int i=1;
        while(!q.isEmpty()){
            System.out.println(i++ + " value ");
            Iterator<Integer> t = q.poll();
            if(t.hasNext()){
                System.out.print(t.next()+" ");
                q.add(t);
            }

        }

    }



}
