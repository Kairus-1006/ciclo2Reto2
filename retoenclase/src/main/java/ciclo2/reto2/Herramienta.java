package ciclo2.reto2;

public class Herramienta {
    
    //Atributos
    private Integer tiempoUso;
    private boolean certificada;
    private double valorBase;
    
    //Constantes
    private final static double VALORBASE = 25.0;
    private final static Integer TIEMPOUSO = 2;
    private final static boolean CERTIFICADA = false;


    //Constructores
    public Herramienta(){
        //Codigo
        this(TIEMPOUSO, CERTIFICADA, VALORBASE);
    }

    public Herramienta(Integer tiempoUso, double valorBase){
        //Codigo
        this(tiempoUso, CERTIFICADA, valorBase);
    }

    public Herramienta(Integer tiempoUso, Boolean certificada, double valorBase ){
        //Codigo
        this.tiempoUso = tiempoUso;
        this.valorBase = valorBase;
        this.certificada = certificada;
    }

    //Metodos
    public double calcularValor(){
        double cambioPrecio = 0.0;

        if (certificada) {
            cambioPrecio += 30;
        }

        if (tiempoUso >= 2 && tiempoUso <= 3) {
            cambioPrecio -= 0.1 * valorBase;
        }else if(tiempoUso > 3 && valorBase <= 5){
            cambioPrecio -= 0.3 * valorBase;
        }else if(tiempoUso > 5){
            cambioPrecio -= 0.4 * valorBase;
        }else if(tiempoUso < 2){
            cambioPrecio += 0;
        }

        return valorBase + cambioPrecio;
    }
}
