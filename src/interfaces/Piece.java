package interfaces;

public interface Piece {

    boolean isValidMove(int fromX, int fromY, int toX, int toY, ChessBoard board);

    boolean canCapture(int fromX, int fromY, int toX, int toY, ChessBoard board);

    boolean isWhite();
        String getType();
}
