package ubungen1;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedLisst {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.add(" Max");
        ll.push("Tom");
        ll.push("Lilli");
        //ll.pop();
      //  ll.remove(2);

        System.out.println(ll.getFirst());
        System.out.println(ll.size());
        System.out.println();
        for (ListIterator<String> tt= ll.listIterator(); tt.hasNext();) {  // fue die Verkettete Liste
            System.out.println(tt.next());
        }



        LinkedList<Integer> lll = new LinkedList<>();

        lll.add(7);
        lll.add(96);
        lll.add(436);
        for(ListIterator<Integer> zahl= lll.listIterator(); zahl.hasNext();){
            System.out.println(zahl.next());
        }
        System.out.println(lll.pollLast()+14);
      //  System.out.println(lll.add(45));
    }
}
