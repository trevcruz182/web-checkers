package com.webcheckers.model;

/**
 * CheckerPiece is a model-level representation of a checker piece in a checkers game. Each
 * piece is either red or white and can be a "single" piece or a king.
 */
public class CheckerPiece {

    // Represents the color of the piece
    public enum Color {
        RED, WHITE
    }

    // Represents the type of the piece
    public enum Type {
        SINGLE, KING
    }

    private Color color;
    private Type type;

    public CheckerPiece(Color color) {
        this.color = color;
        this.type = Type.SINGLE;
    }

    public CheckerPiece(Color color, Boolean king){
        this.color = color;
        if(king)
            this.type = Type.KING;
    }

    /**
     * Getter for the color of the piece, RED or WHITE
     * @return Color the piece's color
     */
    public Color getColor() {
        return color;
    }

    /**
     * Getter for the type of the piece, SINGLE or KING
     * @return Type the piece's type
     */
    public Type getType() {
        return type;
    }

    public boolean isKing() {
        return this.type.equals(Type.KING);
    }

    public String toString() {
        if (color == Color.RED) {
            return "R";
        }
        else {
            return "W";
        }
    }

}
