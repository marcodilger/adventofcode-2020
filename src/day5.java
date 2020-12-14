import java.util.List;

public class day5 {
    public static void main(String[] args) {
        List<String> input = readByLine.readAsString("day5.txt");
        
        int highestSeat = 0;
        for (String pass : input) {
            int seat = getSeat(pass);
            if (seat > highestSeat) {
                highestSeat = seat;
            }
        }
        System.out.println(highestSeat);

    }
    
//    public int getSeat(String code) {
//        String row = code.substring(0, 7); //first 8 bits are the row
//    }
    
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
