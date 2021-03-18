import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {
//        функция детерминированна
        Function<String, List<String>> function = x -> {
            return Arrays.asList(x.split(" ").clone()).stream()
                    .sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        };

        String str = "трам пам парарам бам тарарам парам бум";
        System.out.println(function.apply(str));


    }


}



