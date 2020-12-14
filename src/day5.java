import java.util.*;

public class day5 {
    public static void main(String[] args) {
        List<String> input = readByLine.readAsString("day5.txt");
        List<Integer> takenSeats = new ArrayList<Integer>();
        
        for (String pass : input) {
            int seat = getSeat(pass);
            takenSeats.add(seat);
        }
        Collections.sort(takenSeats);
        int lastSeat = takenSeats.get(0);
        for (int i = 1; i < takenSeats.size(); i++) {
            if (takenSeats.get(i) - lastSeat > 1) {
                System.out.println("diff > 1 at seat:" + takenSeats.get(i) + " -> own seat is: " + (takenSeats.get(i)-1));
            }
            lastSeat = takenSeats.get(i);
        }
    }
    
    
    public static int getDecimal(String row) {
        int result = 0;
        for (int i = 0; i < row.length(); i++) {
            if (row.charAt(i) == 'B'| row.charAt(i) == 'R') {
                result = result + (int) Math.pow(2.0, row.length()-(i+1));
            }
        }
        return(result);
    }
    
    public static int getSeat(String pass) {
        int row = getDecimal(pass.substring(0, 7));
        int col = getDecimal(pass.substring(7, 10));
        
        return((row*8) + col);
    }
}
