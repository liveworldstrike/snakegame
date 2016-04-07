
/**
 * Write a description of class SnakeGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SnakeGame
{
    private Canvas lienzo;
    private Snake serpiente;
    private static final int ANCHO_LIENZO = 500;
    private static final int ALTO_LIENZO = 500;

    /**
     * Constructor de la clase Snake
     */
    public SnakeGame()
    {
        lienzo = new Canvas("Snake game", ANCHO_LIENZO, ALTO_LIENZO);

    }

    /**
     * Dibuja una serpiente en la pantalla
     */
    public void drawSnake()
    {
        serpiente = new Snake(ANCHO_LIENZO,ALTO_LIENZO);
        lienzo.erase();
        serpiente.dibujar(lienzo);
        
    }
    
    /**
     * la serpiente se mueve 
     */
    public void animateSnake()
    {
      drawSnake();
      boolean puede = true;
      while(puede){
          lienzo.wait(60);
          serpiente.borrar(lienzo);
          puede = serpiente.mover(lienzo);
          serpiente.dibujar(lienzo);
          
        }
      lienzo.drawString("GAME OVER",(ANCHO_LIENZO/2)-45,( ALTO_LIENZO/2));
    }
    
    /**
     * galletas aleatorias 
     */
    public void startGame()
    {
        
        
    }
}
