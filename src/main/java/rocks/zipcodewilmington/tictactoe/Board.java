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
        int xCounter = 0;
        boolean xRowWinner = false;



        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(matrix[i][j] == 'X'){
                    xCounter++;
                }
            }
            if(xCounter == 3){
                xRowWinner = true;
            }
        }

        return xRowWinner;
    }

    public Boolean isInFavorOfO() {
        int oCounter = 0;
        boolean oRowWinner = false;


        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(matrix[i][j] == 'O'){
                    oCounter++;
                }
            }
            if(oCounter == 3){
                oRowWinner = true;
            }
        }

        return oRowWinner;
    }

    public Boolean isTie() {
        return null;
    }

    public String getWinner() {
        String winner = "";


        if(isInFavorOfO() && !isInFavorOfX()){
            winner = "O";
        } else if (!isInFavorOfO() && isInFavorOfX()) {
            winner = "X";
        }
        return winner;
    }

}
