import java.awt.Color;
/**
 * Write a description of class Segment here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Segment
{
    //posicion x
    private int posicionX;
    //posicion y 
    private int posicionY;
    //longitud del segmento 
    public static final int LONGITUD_SEGMENTO = 4;
    //color segento 
    private Color color;
    //direccion 
    private int direccion ;

    /**
     * Constructor for objects of class Segment
     */
    public Segment(int x,int y,int direccion ,Color color )
    {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }
    
    /**
     * dibuja la serpiente los 3 segmentos 
     */
    public void dibujar(Canvas canvas)
    {
      canvas.setForegroundColor(color);
      //hacia arriba
      if (direccion == 0){
          canvas.drawLine(posicionX,posicionY,posicionX,posicionY - LONGITUD_SEGMENTO);
      }
      //hacia abajo
      else if (direccion == 1){
          canvas.drawLine(posicionX,posicionY,posicionX,posicionY + LONGITUD_SEGMENTO);
      }
      //izquierda 
      else if (direccion == 2){
         canvas.drawLine(posicionX,posicionY,posicionX- LONGITUD_SEGMENTO,posicionY); 
      }
      //derecha 
      else if (direccion == 3){
          canvas.drawLine(posicionX,posicionY ,posicionX + LONGITUD_SEGMENTO,posicionY);
      }
      
    }
    
   
    
    
}
