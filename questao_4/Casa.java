
public class Casa {
    String cor;
    Porta[] listaPortas = new Porta[3];
    int quantasPortasEstaoAbertas(){
        int i, qtdPortaAberta=0;
        for (i=0;i<3;i++){
            if (listaPortas[i].estaAberta()==1){
                qtdPortaAberta++;
            }
        }
        return qtdPortaAberta;
    }
}
