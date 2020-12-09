import java.util.List;

public class day1 {
    public static void main(String[] args) {
        // part 1
        
        List<Integer> inputInt = readByLine.readAsInt("day1.txt");
        // System.out.println(inputInt);
        
        int goal = 2020;
        int result = 0;
        
        for (int expense : inputInt) {
            if (expense < goal) {
                for (int secondexpense : inputInt) {
                    if (expense + secondexpense == goal) {
                        System.out.println(expense + ";" + secondexpense);
                        result = expense * secondexpense;
                    }
                }
            }
        }
            
        
        
        System.out.print("Result part1: ");
        System.out.println("" + result);
        
        
        
    }
}