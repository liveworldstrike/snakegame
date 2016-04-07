import java.util.Random;
import  java.awt.Color;
/**
 * Write a description of class Galleta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Galleta
{
    private static final int TAMAÑO_GALLETA = 6;
    private int anchoLienzo;
    private int altoLienzo;
    private int posicionX;
    private int posicionY;

    /**
     * Constructor for objects of class Galleta
     */
    public Galleta(int anchoLienzo, int altoLienzo)
    {
        this.anchoLienzo = anchoLienzo;
        this.altoLienzo = altoLienzo;
        Random num = new Random();
        posicionX = num.nextInt(anchoLienzo);
        posicionY = num.nextInt(altoLienzo);
    }

    /**
     * Dibuja la galleta
     */
    public void dibujar(Canvas lienzo)
    {
        lienzo.fillCircle(posicionX, posicionY, TAMAÑO_GALLETA);
    }

    /**
     * Borra la galleta
     */
    public void borrar(Canvas lienzo)
    {
        lienzo.eraseCircle(posicionX, posicionY, TAMAÑO_GALLETA);
    }

    /**
     * Devuelve la posicionX
     */
    public int getPosicionX()
    {
        return posicionX;
    }

    /**
     * Devuelve la posicionY
     */
    public int getPosicionY()
    {
        return posicionY;
    }
}

