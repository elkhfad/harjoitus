package harjoitus2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumeroHarjoitus {

    BiFunction<Integer, Integer, String> naturalNumbersPrintBetweenValues = (x, y) -> IntStream.range(x + 1, y)
            .mapToObj(i -> ((Integer) i).toString()).collect(Collectors.joining(", "));
    BiFunction<Integer, Integer, Integer> naturalNumbersBetweenValues = (x, y) -> x - y - 1;

    public List<Range> hashMapValue(List<Integer> lista) {
        HashMap<Integer, List<Range>> map = new HashMap<>(); 
        for (int i = 0; i < lista.size() - 1; i++) {
            int calc = naturalNumbersBetweenValues.apply(lista.get(i + 1), lista.get(i));
            List<Range> numbersInMap = map.getOrDefault(calc, new ArrayList<>());
            numbersInMap.add(new Range(calc, lista.get(i), lista.get(i + 1)));
            map.putIfAbsent(calc, numbersInMap);
        }
        Integer min = map.keySet().stream().filter(key -> key > 0).min(Comparator.comparing(Integer::valueOf))
                .orElseGet(() -> null);

        System.out.println("Min " + min);
        System.out.print("Numerot ovat ");
        if (min == null) {
            return new ArrayList<>();
        }
        map.get(min).forEach(v -> {
            System.out.print("\nVali: " + v.getBetween() + " luonnolliset luvut = ");
            System.out.print(naturalNumbersPrintBetweenValues.apply(v.getFirst(), v.getSecond()));
        });
        return map.get(min);
    }

}
