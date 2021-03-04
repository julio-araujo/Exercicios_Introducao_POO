public class Porta {
    double largura;
    double altura;
    String cor;
    int estado=1; //por definição -1 é aberto e 1 é fechado
    void estaAberta(){
        if (estado==1){
            System.out.print("está fechado\n");
        }
        else if (estado==-1){
            System.out.print("está aberto\n");
        }
    }
}
