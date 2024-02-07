import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;



public class Main {
    public static void main(String[] args) {
        Integer number;
        int sum = 0;
        ArrayList<String> stringsFromFile = new ArrayList<>();
        ArrayList<Integer> arrey = new ArrayList<>();
        ArrayList<String> stringArrayList = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(new File("file.txt"));

            while (scanner.hasNextLine()) {
                stringsFromFile.add(scanner.nextLine());

            }

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for (String word : stringsFromFile) {


            for (char wordPart : word.toCharArray()) {
                if (Character.isDigit(wordPart)) {
                    String a = String.valueOf(wordPart);
                    stringArrayList.add(a);

                }

            }

            String convert = stringArrayList.get(0) + stringArrayList.get(stringArrayList.size() - 1);
            number = Integer.valueOf(convert);
            arrey.add(number);

            for (
                    int finalValue : arrey) {
                sum += finalValue;

            }
            arrey.removeAll(arrey);
            stringArrayList.removeAll(stringArrayList);
        }
        System.out.println(sum);
    }

}



