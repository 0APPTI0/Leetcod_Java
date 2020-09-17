package _36有效数独;
//
//public class Solution {
//    public boolean isValidSudoku(char[][] board) {
//        for (int i = 0; i <= 2; i ++){
//            for (int j = 0; j <= 2; j ++){
//                if (!judgeSmallMatrix(board, i, j)){
//                    return false;
//                }
//            }
//        }
//
//        for (int k = 0; k < 9; k ++){
//            if (!judgeColumn(board, k)){
//                return false;
//            }
//        }
//
//        for (int l = 0; l < 9; l ++){
//            if (!judgeColumn(board, l)){
//                return false;
//            }
//        }
//
//        return true;
//    }
//
//    public boolean judgeSmallMatrix(char[][] board, int x, int y){
//        int[] test = new int[10];
//        int x1 = x*3;
//        int x2 = x1 + 3;
//        int y1 = y * 3;
//        int y2 = y1 + 3;
//        for (int i = x1; i < x2; i ++){
//            for (int j = y1; j < y2; j++){
//                if (board[i][j] == '.'){
//                    continue;
//                }
//                if (test[(board[i][j]) - '0'] != 0){
//                    return false;
//                }
//                else {
//                    test[(board[i][j]) - '0'] += 1;
//                }
//            }
//        }
//        return true;
//    }
//
//    public boolean judgeRow(char[][] board, int row){
//        int[] test = new int[10];
//        for (int i = 0; i < 9; i ++){
//            if (board[row][i] == '.'){
//                continue;
//            }
//            if (test[(board[row][i]) - '0'] != 0){
//                return false;
//            }
//            else {
//                test[(board[row][i] - '0')] += 1;
//            }
//        }
//        return true;
//    }
//
//    public boolean judgeColumn(char[][] board, int column){
//        int[] test = new int[10];
//        for (int i = 0; i < 9; i ++){
//            if (board[i][column] == '.'){
//                continue;
//            }
//            if (test[(board[i][column]) - '0'] != 0){
//                return false;
//            }
//            else {
//                test[(board[i][column]) - '0'] += 1;
//            }
//        }
//        return true;
//    }
//}

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        int [][]row  =new int[9][10];
        int [][]col  =new int[9][10];
        int [][]box  =new int[9][10];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j]=='.'){
                    continue;
                }
                int curNum = board[i][j]-'0';
                if (row[i][curNum]==1){
                    return false;
                }if (col[j][curNum]==1){
                    return false;
                }
                if (box[j/3 + (i/3) * 3][curNum]==1){
                    return false;
                }
                row[i][curNum]=1;
                col[j][curNum]=1;
                box[j/3 + (i/3) * 3][curNum]=1;
            }
        }
        return true;
    }
}