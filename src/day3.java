import java.util.List;

public class day3 {
    public static void main(String[] args) {
        List<String> input = readByLine.readAsString("day3.txt");
        
        //get width of a line
        int width = input.get(0).length();
        
        // traverse right 3 down 1
        // part2:

//        Right 1, down 1.
//        Right 3, down 1. (This is the slope you already checked.)
//        Right 5, down 1.
//        Right 7, down 1.
//        Right 1, down 2.
        int right[] = {1, 3, 5, 7, 1};
        int down[] = {1, 1, 1, 1, 2};
        int count[] = {0, 0, 0, 0, 0};
        for (int j = 0; j < 5;  j++) {
            for (int i = 0; i < input.size(); i = i+down[j]) {
                int charPos = ((i/down[j])*right[j]) % width;
                if (input.get(i).charAt(charPos) == '#') {
                    count[j]++;
                }
            }
            System.out.println(count[j]);
        }
 
        System.out.println(
                count[0]*
                count[1]*
                count[2]*
                count[3]*
                count[4]);
    }

}
