public class NewMain {
    public static void main(String[] args) {
        Pessoa x = new Pessoa();
        x.idade=20;
        x.diaMes="14/07";
        x.nome="julio";
        x.aniverssario("14/07");
        x.aniverssario("15/07");
        x.aniverssario("14/07");
        System.out.print("o nome da pessoal é "+x.nome+" e sua ideade atual é: "+x.idade);
    }
}
