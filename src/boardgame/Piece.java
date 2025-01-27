package boardgame;

public class Piece {
    protected Position position;
    private Board board; //Peça esta associada com um tabuleiro

    public Piece(Board board) {
        this.board = board;
    }

    protected Board getBoard() {
        return board;
    }
}
