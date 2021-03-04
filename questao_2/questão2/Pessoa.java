public class Pessoa {
    String nome;
    String diaMes;
    int idade=0;
    void aniverssario(String data){
        if (diaMes==data){
            idade+=1;
        }
    }
}
