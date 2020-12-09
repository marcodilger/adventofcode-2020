import java.util.List;


public class day2 {
    public static void main(String[] args) {
        List<String> input = readByLine.readAsString("day2.txt");
        int validpw = 0;
        
        //exemplary with first line, then put this in loop
        for (String line : input) {
            
        
        
        String[] passwd = line.split(" ");
        // parse min, max
        String range = passwd[0];
        int pos1 = Integer.parseInt(range.split("-")[0]);
        int pos2 = Integer.parseInt(range.split("-")[1]);
        
        // parse character of interest
        char coi = passwd[1].replace(":","").charAt(0);
        
        // count occurrences of coi
        if (passwd[2].charAt(pos1-1) == coi ^ passwd[2].charAt(pos2-1) == coi) {
            validpw++;
        }
       
        }
        System.out.println("valid pws:" + validpw);

    }
// not needed for part2   
//    private static int countOccurences( //https://www.baeldung.com/java-count-chars
//            String someString, char searchedChar, int index) {
//              if (index >= someString.length()) {
//                  return 0;
//              }
//              
//              int count = someString.charAt(index) == searchedChar ? 1 : 0;
//              return count + countOccurences(
//                someString, searchedChar, index + 1);
//          }

}
