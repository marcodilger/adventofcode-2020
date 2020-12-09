import java.util.List;

public class day3 {
    public static void main(String[] args) {
        List<String> input = readByLine.readAsString("day3.txt");
        int counts = 0;
        
        //get width of a line
        int width = input.get(0).length();
        
        // traverse right 3 down 1
        for (int i = 0; i < input.size(); i++) {
            int charPos = (i*3) % width;
            if (input.get(i).charAt(charPos) == '#') {
                counts++;
            }
        }
        System.out.println(counts);
        
    }

}
