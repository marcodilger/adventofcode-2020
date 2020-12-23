import java.util.List;

public class day9 {

    public static void main(String[] args) {
        List<Integer> input = readByLine.readAsInt("day9.txt");
        
        int length = 25;
        int pos = 0;
        while (pos < input.size() - length - 1) {
            
        
        int target = input.get(pos+length+1);
        // outer loop
        boolean found = false;
        for (int outer = pos; outer < pos + length-1; outer++) {
            if (found) {
                break;
            }
            int outerValue = input.get(outer);
            // inner loop
            for (int inner = outer + 1; inner <= pos + length; inner++) {
                if (input.get(inner) + outerValue == target) {
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("no pairs found for target: " + target);
            break;
        }
        pos = pos + 1;
        }

    }

}
