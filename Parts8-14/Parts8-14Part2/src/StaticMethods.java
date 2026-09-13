import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StaticMethods {
    public static List<Integer> positive(List<Integer> numbers) {
        List<Integer> list = numbers.stream()
                .filter(value -> value % 2 == 0)
                .collect(Collectors.toList());

        return list;
    }

    public static ArrayList<Integer> divisible(ArrayList<Integer> numbers) {

        ArrayList<Integer> list = numbers.stream()
                .filter(value -> (value % 2 == 0) || (value % 3 ==0) || (value % 5 ==0))
                .collect(Collectors.toCollection(ArrayList::new));
        return list;
    }

    public static List<String> read(String file) {
        List<String> line = new ArrayList<>();
        try {
            Files.lines(Paths.get(file)).forEach(value -> line.add(value));
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return line;
    }


}
