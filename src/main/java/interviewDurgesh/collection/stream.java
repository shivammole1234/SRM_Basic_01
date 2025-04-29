package interviewDurgesh.collection;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class stream {

    public static void main(String[] args) {
        List<String> names= Arrays.asList("Shiam","gauri","mayu","shivani","shravni");

        List<String > filtername=names
                                 .stream()
                .filter(name->name.startsWith("S")).collect(Collectors.toList());

        System.out.println(filtername);

        Stream<Double> randNum=Stream.generate(Math::random).limit(12);
        randNum.forEach(System.out::println);
    }
}
