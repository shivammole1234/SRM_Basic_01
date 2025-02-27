package interviewDurgesh.comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortExample {

    public static void main(String[] args) {
        ArrayList<EmpComparable> emp=new ArrayList<>();
        emp.add(new EmpComparable("Shivam",3,11));
        emp.add(new EmpComparable("Aditya",21,2));
        emp.add(new EmpComparable("Kunal",11,3));

        System.out.println(emp);
       // Collections.sort(emp,new IdComparator() );
        System.out.println(emp);


    }
}
