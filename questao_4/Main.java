
public class Main {
    public static void main(String[] args) {
        Casa house = new Casa();
        house.cor="Preto"; //altera cor da casa
        //cria as portas e as adiciona à casa
        for (int i=0;i<3;i++){
            Porta x = new Porta();
            house.listaPortas[i]=x;
        }
        //altera o estado da porta
        house.listaPortas[0].estado*=-1;
        // verifica quantas protas estam abertas
        System.out.printf("%d portas estam abertas agora",house.quantasPortasEstaoAbertas());
    }
}
