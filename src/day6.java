import java.util.HashSet;
import java.util.List;

public class day6 {
    public static void main(String[] args) {
       List<String> input = readByLine.readAsString("day6.txt");
       int result = 0;
       
       String questions = "";
       for (String line : input) {
           if (line.length() > 0) { // not an empty line
               questions = questions + line;
           } else { // empty line, sum up
               result = result + getQuestions(questions);
               questions = "";
           }
       }
       //additional final sum up:
       result = result + getQuestions(questions);

        System.out.println(result);
    }
    
    public static int getQuestions(String questions) {

        HashSet<Character> set = new HashSet<Character>();
        for (Character c : questions.toCharArray()) {
                    set.add(c);
         }
        return(set.size());
    }

}
