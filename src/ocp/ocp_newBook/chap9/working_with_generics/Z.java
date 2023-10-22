package ocp.ocp_newBook.chap9.working_with_generics;

import java.util.*;

/**
 * @author $ Devalère
 **/
class W {
}

class X extends W {
}

class Y extends X {
}

class Z<Y> {
    // INSERT CODE HERE
    W w1 = new W();
    W w2 = new X();
/*    W w3 = new Y();
    Y y1 = new W();
    Y y2 = new X();
    Y y3 = new Y();*/
    public static void main(String[] args){
        //List<Integer> q = new LinkedList<>();
        //var q = new LinkedList<>();
        Deque<Integer> q = new LinkedList<>();
         q.add(10);
         q.add(12);
         q.remove(12);
         System.out.print(q);

         Map m = new HashMap();
         m.put(123, "456");
         m.put("abc", "def");
         //System.out.println(m.contains("123"));
         System.out.println(m.containsKey("123"));
         System.out.println(m.containsValue("def"));

         var map = Map.of(1,2, 3, 6);
         var list = List.copyOf(map.entrySet());

         List<Integer> one = List.of(8, 16, 2);
         var copy = List.copyOf(one);
         var copyOfCopy = List.copyOf(copy);
         var thirdCopy = new ArrayList<>(copyOfCopy);

         //list.replaceAll(x -> x * 2);
         one.replaceAll(x -> x * 2);
         thirdCopy.replaceAll(x -> x * 2);

         System.out.println(thirdCopy);
    }
}
