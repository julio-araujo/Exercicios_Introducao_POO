public class Agenda {
    Contato agenda[] = new Contato[100];
    int qtdContato=0;
    void dicionarContato(Contato nome){
        if (qtdContato>100){
            System.out.print("lista cheia");
        }
        else{
            agenda[qtdContato]=nome;
            qtdContato+=1;
        }
    }
    void consultarContato(String nomeConsul){
        for (int i = 0;i<100;i++){
            if(agenda[i].nome == null){
                System.out.print("erro, o nome não esta na lista\n");
            }
            else if (nomeConsul == null){
                System.out.print("erro, digite um nome valido\n");
            }
            else{
                System.out.printf("o numero de "+agenda[i].nome+" é "+agenda[i].numero);
            }
        }
    }
}
