package commanchesterdigital;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
        // Generic way of creating an ArrayList:
        ArrayList names1 = new ArrayList();

        //
        ArrayList<String> names2 = new ArrayList<>();
        names2.add("John");
        names2.add("Sue");
        names2.add("Steve");

        int numberOfElements = names2.size();

        System.out.println("Number of elements " + numberOfElements);

        String firstElement = names2.get(0);

        System.out.println("Fist element " + firstElement);

        String removedElement = names2.remove(0);
        System.out.println("Removed " + removedElement);

        ArrayList<String> zooAnimals = new ArrayList<>();
        zooAnimals.add("Lion");
        zooAnimals.add("Hippo");
        zooAnimals.add("Leopard");

        // Are there any leopards
        System.out.println("Contains leopards" + zooAnimals.contains("Leopard"));

        Collections.sort(zooAnimals);
        System.out.println("Animal after sort at index 0" + zooAnimals.get(0));

        Collections.shuffle(zooAnimals);

        // Overrides element index X:
        zooAnimals.set(1, "Cheetah");

        System.out.println(zooAnimals.get(1));

        // Empties ArrayList:
        zooAnimals.clear();

        System.out.println(zooAnimals.size());

        int[] lotteryArr = new int[10];

        int[] lotteryArr2 = {1, 23, 45, 6 ,88};

        List<Integer> lotteryNumbers = Arrays.asList(1, 23, 45, 6 ,88);





    }
}
