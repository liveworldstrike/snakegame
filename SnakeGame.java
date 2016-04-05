
/**
 * Write a description of class SnakeGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SnakeGame
{
    private Snake esperma;
    private Canvas lienzo;
    private static final int ANCHO_LIENZO = 500;
    private static final int ALTO_LIENZO = 500;

    /*
     * Constructor de la clase Snake
     */
    public SnakeGame()
    {
        esperma = new Snake(ANCHO_LIENZO,ALTO_LIENZO);
        lienzo = new Canvas("SnakeGame",ANCHO_LIENZO,ALTO_LIENZO);
    }

    
    /*
     * Dibuja una serpiente en la pantalla
     */
    public void drawSnake()
    {
        esperma.dibujar(lienzo);
    }

}
