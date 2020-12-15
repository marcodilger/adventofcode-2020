import java.util.HashMap;
import java.util.List;

public class day6 {
    public static void main(String[] args) {
       List<String> input = readByLine.readAsString("day6.txt");
       int result = 0;
       
       //part2: works only if nobody answeres the same question multiple times:
       // use hashmap to count each character,
       //keep track of no of respondees
       // count amount of values that == no of respondees
       
       String questions = "";
       int respondees = 0;
       for (String line : input) {
           if (line.length() > 0) { // not an empty line
               questions = questions + line;
               respondees++;
           } else { // empty line, sum up
               result = result + getQuestions(questions, respondees);
               questions = "";
               respondees = 0;
           }
       }
       //additional final sum up:
       result = result + getQuestions(questions, respondees);

        System.out.println(result);
    }
    
    public static int getQuestions(String questions, int respondees) {

        HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();
        for (Character c : questions.toCharArray()) {
            if (hashmap.containsKey(c)) { // increase by 1 if present
                hashmap.put(c, hashmap.get(c) + 1); 
            } 
            else {
                hashmap.put(c, 1);  // place with 1 if not present
            } 
        }
        // count characters which have a value of number of respondees
        int result = 0;
        for (Integer counts : hashmap.values()) {
            if (counts == respondees) {
                result++;
            }
        }
        return result;
    }

}
