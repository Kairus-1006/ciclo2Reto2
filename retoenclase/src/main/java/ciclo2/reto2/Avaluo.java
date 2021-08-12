package ciclo2.reto2;

public class Avaluo {
    
    //Atributos
    private double valorTotalHerramientas;
    private double valorTotalHerramientasElectricas;
    private double valorTotalHerramientasManuales;
    private Herramienta[] herramientas;

    //Constructores
    Avaluo(Herramienta[] pHerramientas){
        herramientas = pHerramientas;
    }


    //Metodos
    public void presentarTotales(){
        for (int i = 0; i < herramientas.length; i++){
            
            valorTotalHerramientas += herramientas[i].calcularValor();

        }

        System.out.println(Math.round(valorTotalHerramientas));
        System.out.println(Math.round(valorTotalHerramientasElectricas));
        System.out.println(Math.round(valorTotalHerramientasManuales));
        //System.out.println(Math.round(totalConjunto));
    }
}
