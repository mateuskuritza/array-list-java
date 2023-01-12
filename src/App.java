import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> firstList = new ArrayList<>();

        firstList.add("Morango");
        firstList.add("Uva");
        firstList.add("Acerola");
        firstList.add("Manga");

        List<String> secondList = new ArrayList<>();

        secondList.add("Pêra");
        secondList.add("Caju");
        secondList.add("Morango");
        secondList.add("Kiwi");

        
        List<String> duplicates = new ArrayList<>();
        
        firstList.forEach(element -> {
            if(secondList.contains(element)){
                duplicates.add(element);
            }
        });

        System.out.println(duplicates);
    }
}
