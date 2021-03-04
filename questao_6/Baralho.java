import java.util.Random;
/* obs: perceba que não foi utilizado nomes especiais (AS,Rei,...). 
a utizização delas será feina no main, atravez de um if.
*/
public class Baralho {
    Carta []cards = new Carta[52];
    void ordenaBaralho(){
        int i;
        for (i=0;i<13;i++){
            cards[i].naipe="copas";
            cards[i].valor=i%13;
        }
        for (i=13;i<26;i++){
            cards[i].naipe="espadas";
            cards[i].valor=i%13;
        }
        for (i=26;i<39;i++){
            cards[i].naipe="ouros";
            cards[i].valor=i%13;
        }
        for (i=39;i<52;i++){
            cards[i].naipe="paus";
            cards[i].valor=i%13;
        }
    }
    void embaralha(){
        Random num = new Random();
        int i;
        for (i=0;i<52;i++){
            int j = num.nextInt(52);
            Carta temp=cards[i];
            cards[i]=cards[j];
            cards[j]=temp;
        }
    }
    void iniciaBaralho(){
        int i;
        for (i=0;i<52;i++){
            Carta novaCarta = new Carta();
            cards[i]=novaCarta;
        }
        for (i=0;i<13;i++){
            cards[i].naipe="copas";
            cards[i].valor=i%13;
        }
        for (i=13;i<26;i++){
            cards[i].naipe="espadas";
            cards[i].valor=i%13;
        }
        for (i=26;i<39;i++){
            cards[i].naipe="ouros";
            cards[i].valor=i%13;
        }
        for (i=39;i<52;i++){
            cards[i].naipe="paus";
            cards[i].valor=i%13;
        }
    }
}