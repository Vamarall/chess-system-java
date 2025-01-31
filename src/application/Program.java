package application;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();
        List<ChessPiece> captured = new ArrayList<>();


        while (true) {
            UI.printBoard(chessMatch.getPieces());
            System.out.println();

            UI.printMatch(chessMatch, captured);
            System.out.println("Source: ");
            ChessPosition source = UI.readChessPosition(sc);
            boolean[][] possibleMoves = chessMatch.possibleMoves(source);
            UI.printBoard(chessMatch.getPieces(), possibleMoves);

            System.out.println("Target: ");
            ChessPosition target = UI.readChessPosition(sc);

            ChessPiece capturedPiece = chessMatch.performChessMove(source, target);

            if (capturedPiece != null) {
                captured.add(capturedPiece);
            }
        }


    }


}
