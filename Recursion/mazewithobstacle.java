public class mazewithobstacle {
    public static void main(String[] args) {
        boolean[][] board = {
            {true , true , false} ,
            {true , false , true} , 
            {true , true , true}
        };
        mazeobstacle(board, "", 0, 0);
    }
    static void mazeobstacle(boolean[][] mazeboard,String path, int row , int col){ 
        // number of possible ways to reach destination startingpoint{r,c} to destination{1,1} return as string
        if (row == mazeboard.length - 1 && col == mazeboard[0].length - 1) {
            System.out.println(path);
            return;
        }
        if (mazeboard[row][col] == false) {
            return;
        }
        if (row < mazeboard.length - 1) {
            mazeobstacle(mazeboard, path + 'D', row + 1, col);
        }
        if (col < mazeboard[0].length - 1) {
            mazeobstacle(mazeboard, path + 'R', row, col + 1);
        }
    }
}
