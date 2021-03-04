public class Pedido {
    int qtdLoja=0, qtdCliente=0;
    Produto [] loja = new Produto[100];
    Produto [] compra = new Produto[100];
    
    void addLoja(double custo,int quantidade, int cod){
        loja[qtdLoja]=new Produto();
        loja[qtdLoja].codigoProd=cod;
        loja[qtdLoja].preco=custo;
        loja[qtdLoja].qtd=quantidade;
        qtdLoja++;
    }
    void carrinho(int cod, int quantidade){
        compra[qtdCliente]=new Produto();
        compra[qtdCliente].codigoProd=cod;
        compra[qtdCliente].qtd=quantidade;
        qtdCliente++;
    }
    void finalizaCompra(){
        int i,j;
        double total=0;
        for (i=0;i<qtdCliente;i++){
            for (j=0;j<qtdLoja;j++){
                if (loja[j].codigoProd==compra[i].codigoProd){
                    total+= loja[j].preco*compra[i].qtd;
                }
            }
        }
        System.out.printf("total da compra: %.2f\n",total);
    }
}