package interviewDurgesh.collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LisyTraversel {

    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("ram");
        names.add("sita");
        names.add("ravan");
        names.add("vanar");

        for(String name:names)
            System.out.println(name);

        Iterator<String> nameIterator =names.iterator();
        System.out.println("======================================");
        while(nameIterator.hasNext()){
            String ele=nameIterator.next();
            System.out.println(ele);
        }
        System.out.println("======================================");

        // we can traverse back and front from this
        ListIterator<String> listItr=names.listIterator();

        while(listItr.hasNext()){
            String next=listItr.next();
            System.out.println(next);
        }
        System.out.println("======================================");

//        ListIterator<String> listIterator2=names.listIterator(names.size());
//        while(listIterator2.hasPrevious()){
//            System.out.println();
//        }

        names.forEach((ele)->{
            System.out.println(ele);
        });
    }
}