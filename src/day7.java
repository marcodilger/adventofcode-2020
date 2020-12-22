import java.util.*;

public class day7 {
    public static void main(String[] args) {
        List<String> input = readByLine.readAsString("day7.txt");
        String hotRule = "shiny gold"; // start with this hot rule
        HashSet<String> validContainers = new HashSet<String>();  //saves all found containers which are valid
        Deque<String> stack = new ArrayDeque<String>();//from here, subsequently, the hotRules are taken and
                                                            // added as they are found
        stack.add(hotRule); // "shiny gold" is the first hot rule

        while (stack.size() > 0) {
            hotRule = stack.pop();
            // create temporary lis with rules to be removed from input
            List<String> inputRemove = new ArrayList<String>();
            
                for (String rule : input) {
 
                    String currentContent = rule.split(" bags contain ")[1];
                    String currentContainer = rule.split(" bags contain ")[0];


                    if (currentContent.contains(hotRule) & !validContainers.contains(currentContent)) {
                        stack.add(currentContainer);
                        validContainers.add(currentContainer);
                        inputRemove.add(rule);
                    }
                }
                input.removeAll(inputRemove);
        }
        System.out.println("amount of validContainers: " + validContainers.size());
    
    }
    
}
