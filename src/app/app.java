package app;

import  chess.ChessMatch;

public class app {

    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();
        ConsoleInterface.printBoard(chessMatch.getPieces());
    }

}