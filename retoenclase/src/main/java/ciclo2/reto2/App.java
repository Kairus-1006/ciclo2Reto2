package ciclo2.reto2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Herramienta[] herramientas = new Herramienta[5];
        herramientas[0] = new Herramienta(3, true, 30.0);
        herramientas[1] = new Electricas(3, true, 30.0, true);
        herramientas[2] = new Manuales(3, true, 30.0, "TRAZO");
        herramientas[3] = new Herramienta();
        herramientas[4] = new Manuales(5, true, 90.0, "MEDIDA");
        Avaluo respuesta = new Avaluo(herramientas);
        respuesta.presentarTotales();
    }
}
