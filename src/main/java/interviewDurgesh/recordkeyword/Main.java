package interviewDurgesh.recordkeyword;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        var person=new Person(12,"shivam","OYO Eben","987656");
        //System.out.println(person);
        //System.out.println(person.id());

       // person.staticMethod();
        Map<String,Integer> marks=new HashMap<>();
        marks.put("Rohit",12); 
        marks.put("kiran",13);
        Optional<Integer> rohitMArks= Optional.ofNullable(marks.get("Roheit"));

        System.out.println("marks "+rohitMArks);
        if(rohitMArks.isPresent())
            System.out.println("present ");
        else
            System.out.println("not ");
    }
}
