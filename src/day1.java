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
                    if (expense + secondexpense < goal) {
                        for (int thirdexpense : inputInt) {
                            if (expense + secondexpense + thirdexpense == goal) {
                                System.out.println(expense + ";" + secondexpense + ";" + thirdexpense);
                                result = expense * secondexpense * thirdexpense;
                            }
                    }
                    
                    }
                }
            }
        }
            
        
        
        System.out.print("Result part1: ");
        System.out.println("" + result);
        
        
        
    }
}