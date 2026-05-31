class Solution {


    public boolean isValidSudoku(char[][] board) {
        // Arrays to store the bitmask for rows, columns, and 3x3 boxes
        int[] rows = new int[9];
        int[] cols = new int[9];
        int[] boxes = new int[9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char val = board[i][j];
                
                // Skip empty cells
                if (val == '.') {
                    continue;
                }

                // Convert character '1'-'9' to a 0-indexed integer (0-8)
                int num = val - '1';
                
                // Generate a bitmask for this number (e.g., if num is 3, mask is 000001000)
                int mask = 1 << num;

                // Calculate the unique box index (0 to 8) for the 3x3 grid
                int boxIndex = (i / 3) * 3 + (j / 3);

                // Check if the bit is already set in the current row, column, or box
                if ((rows[i] & mask) != 0 || (cols[j] & mask) != 0 || (boxes[boxIndex] & mask) != 0) {
                    return false;
                }

                // Set the bit to register that we have seen this number
                rows[i] |= mask;
                cols[j] |= mask;
                boxes[boxIndex] |= mask;
            }
        }
        return true;
    }
}


    
