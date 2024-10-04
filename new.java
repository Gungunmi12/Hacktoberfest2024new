import java.util.HashSet;
import java.util.Set;

public boolean isSafeInRow(int[][] board, int row, int num) {
    Set<Integer> seen = new HashSet<>();
    
    // Iterate through each column in the specified row
    for (int i = 0; i < 9; i++) {
        // If a number is already present in the row, add it to the set
        if (board[row][i] != 0) {
            seen.add(board[row][i]);
        }
    }
    
    // Check if the number already exists in the set
    return !seen.contains(num);
}
