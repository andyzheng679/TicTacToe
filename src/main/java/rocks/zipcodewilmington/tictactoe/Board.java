package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private Character[][] matrix;

    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }

    public Boolean isInFavorOfX() {
        // Check rows
        for(int i = 0; i < 3; i++){
            int rowCounter = 0;
            for(int j = 0; j < 3; j++){
                if(matrix[i][j] == 'X'){
                    rowCounter++;
                }
            }
            if(rowCounter == 3) return true;
        }

        // Check columns
        for(int i = 0; i < 3; i++){
            int colCounter = 0;
            for(int j = 0; j < 3; j++){
                if(matrix[j][i] == 'X'){
                    colCounter++;
                }
            }
            if(colCounter == 3) return true;
        }

        // Check left diagonal
        if(matrix[0][0] == 'X' && matrix[1][1] == 'X' && matrix[2][2] == 'X') return true;

        // Check right diagonal
        if(matrix[0][2] == 'X' && matrix[1][1] == 'X' && matrix[2][0] == 'X') return true;

        // No win found
        return false;
    }


    public Boolean isInFavorOfO() {
        // Check rows
        for(int i = 0; i < 3; i++){
            int rowCounter = 0;
            for(int j = 0; j < 3; j++){
                if(matrix[i][j] == 'O'){
                    rowCounter++;
                }
            }
            if(rowCounter == 3) return true;
        }

        // Check columns
        for(int i = 0; i < 3; i++){
            int colCounter = 0;
            for(int j = 0; j < 3; j++){
                if(matrix[j][i] == 'O'){
                    colCounter++;
                }
            }
            if(colCounter == 3) return true;
        }

        // Check left diagonal
        if(matrix[0][0] == 'O' && matrix[1][1] == 'O' && matrix[2][2] == 'O') return true;

        // Check right diagonal
        if(matrix[0][2] == 'O' && matrix[1][1] == 'O' && matrix[2][0] == 'O') return true;

        // No win found
        return false;
    }

    public Boolean isTie() {
        boolean isTie = false;

        if(isInFavorOfO() == false && isInFavorOfX() == false){
            isTie = true;
        }

        return isTie;
    }

    public String getWinner() {
        String winner = "";


        if(isInFavorOfO() == true){
            winner = "O";
        } else if (isInFavorOfX() == true) {
            winner = "X";
        }
        return winner;
    }

}