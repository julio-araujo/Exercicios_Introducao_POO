public class Celular {
    int capacidadeBateria=100;
    int nivelBateria=100;
    
    void ligar(int tempo){
        nivelBateria-=(tempo/5);
    }
    void texto(){
        nivelBateria-=1;
    }
    void consultarNivel(){
        System.out.printf("a bateria ainda possui %.0f ",100*(1.0*nivelBateria)/capacidadeBateria);
    }
}
