package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static List<String> buildApartmentsList(List<Home> list, int a){
        return list.stream()
                .sorted(Home::compareTo)
                .limit(a)
                .map(Home::toString)
                .toList();
    }
}
// END
