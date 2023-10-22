package ocp.ocp_newBook.chat10;

import java.util.ArrayList;

/**
 * @author $ Devalère
 **/
public class LinkingStreamsToUnderlyingData {
    public static void main(String[] args){
//        What do you think this outputs?
         var cats = new ArrayList<String>();
         cats.add("Annie");
         cats.add("Ripley");
         var stream = cats.stream();
         cats.add("KC");
         System.out.println(stream.count());

         /**
          * The correct answer is 3. Lines 25–27 create a List with two elements. Line 28 requests
          * that a stream be created from that List. Remember that streams are lazily evaluated. This
          * means that the stream isn’t created on line 28. An object is created that knows where to
          * look for the data when it is needed. On line 29, the List gets a new element. On line 30, the
          * stream pipeline runs. First, it looks at the source and seeing three elements.*/
    }
}
