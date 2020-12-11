import java.util.List;

public class day4 {
    public static void main(String[] args) {
        List<String> input = readByLine.readAsString("day4.txt");
        
        boolean foundCid = false;
        int fields = 0;
        int valid = 0;
        
        for (int i = 0; i < input.size(); i++) {
            int fieldsThisLine = countOccurences(input.get(i), ':', 0);
            if (fieldsThisLine == 0) { // no passport fields in this line, this is an empty line
                //check if passport is valid
                // if fields = 8: valid,
                // if fields = 7 and foundCid = false then valid
                // all other cases: not valid
                if (fields == 8 | (!foundCid & fields == 7)) {
                    valid++;
                }
                // reset
                foundCid = false;
                fields = 0; 
            } else {
                fields = fields + fieldsThisLine;
                if (input.get(i).contains("cid")) {
                    foundCid = true;
                }
            }
        }
        // manually perform chck for last passport (because loop terminates before checking the last
        if (fields == 8 | (!foundCid & fields == 7)) {
            valid++;
        }
        // print endresult
        System.out.println("result: " + valid);
    }
    
  private static int countOccurences( //https://www.baeldung.com/java-count-chars
  String someString, char searchedChar, int index) {
    if (index >= someString.length()) {
        return 0;
    }
    
    int count = someString.charAt(index) == searchedChar ? 1 : 0;
    return count + countOccurences(
      someString, searchedChar, index + 1);
}
}
