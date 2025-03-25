import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, String> multiples = new HashMap<>();
        multiples.put(3, "Fizz");
        multiples.put(5, "Buzz");

        for (int i = 1 ; i <= 100 ; i++){
            String result = generateResult(i, multiples);
            System.out.println("Result: " + result);
        }
    }

    public static String generateResult(int number, HashMap<Integer, String> multiples){
        StringBuilder result = new StringBuilder();

        for (Integer key : multiples.keySet()){
            if (number % key == 0){
                result.append(multiples.get(key));
            }
        }

        return result.length() > 0 ? result.toString() : String.valueOf(number);
    }
}