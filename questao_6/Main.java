public class Main {
    public static void main(String[] args) {
        Baralho cartas = new Baralho();
        cartas.iniciaBaralho();
        cartas.embaralha();
        for (int i =0;i<52;i++){
            System.out.print(cartas.cards[i].naipe +" "+cartas.cards[i].valor+"\n");
        }
        System.out.println();
        cartas.ordenaBaralho();
        for (int i =0;i<52;i++){
            System.out.print(cartas.cards[i].naipe +" "+cartas.cards[i].valor+"\n");
        }
    }
}
