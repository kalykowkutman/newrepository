
import java.util.*;
public class practicetasks {
    public static void main(String[] args) {

        //1
        System.out.println("  #1   ");

        ArrayList<String> list1 = new ArrayList<>(List.of("Pride and Prejudice", "The Book Thief", "The Alchemist"));
        ArrayList<String> list2 = new ArrayList<>(List.of("Pride and Prejudice", "The Catcher in the Rye", "The Hunger Games"));

        Set<String> unique = new HashSet<>(list1);
        unique.addAll(list2);

        System.out.println(unique);
        System.out.println("  #2   ");


        //2
        ArrayList<String> movies = new ArrayList<>(List.of(
                "The Godfather", "Interstellar", "The Lord of the Rings"
        ));

        String longest = movies.get(0);

        for (String movie : movies) {
            if (movie.length() > longest.length()) {
                longest = movie;
            }
        }

        System.out.println(longest);
        System.out.println("  #3   ");


        //3
        ArrayList<String> foods = new ArrayList<>(List.of(
                "Pizza", "Burger", "Pizza", "Pasta", "Pizza"
        ));

        int count = 0;
        for (String food : foods) {
            if (food.equals("Pizza")) {
                count++;
            }
        }

        System.out.println(count);
        System.out.println("  #4   ");

            //4
        ArrayList<String> fruits = new ArrayList<>(List.of(
                "Apple", "Banana", "Orange", "Banana"
        ));

        fruits.removeIf(fruit -> fruit.equals("Banana"));

        System.out.println(fruits);
        System.out.println("  #5   ");


        //5
        ArrayList<String> colors = new ArrayList<>(List.of(
                "Red", "Blue", "Green"
        ));

        Collections.fill(colors, "Black");

        System.out.println(colors);
        System.out.println("  #6   ");


        //6
        ArrayList<String> sports = new ArrayList<>(List.of(
                "Football", "Tennis", "Basketball"
        ));

        ArrayList<String> check = new ArrayList<>(List.of(
                    "Football", "Tennis"
        ));

        System.out.println(sports.containsAll(check));
        System.out.println("  #7   ");


        //7
        ArrayList<String> flowers = new ArrayList<>(List.of(
                "Rose", "Lily", "Tulip", "Rose"
        ));

        System.out.println(flowers.indexOf("Rose"));
        System.out.println(flowers.lastIndexOf("Rose"));
        System.out.println("   #8    ");


        //8
        ArrayList<String> animals = new ArrayList<>(List.of(
                "Cat", "Dog", "Cat", "Bird"
        ));

        ArrayList<String> unique1 = new ArrayList<>(new HashSet<>(animals));

        System.out.println(unique1);
        System.out.println("   #9    ");


        //9
        ArrayList<String> cities = new ArrayList<>(List.of(
                "Bishkek", "Osh", " Cholpon-Ata "
        ));

        String[] array = cities.toArray(new String[0]);

        System.out.println(Arrays.toString(array));
        System.out.println("    #10    ");


        //10
        Integer[] numbers = {1, 2, 3, 4};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(numbers));
        System.out.println(list);
    }
}

