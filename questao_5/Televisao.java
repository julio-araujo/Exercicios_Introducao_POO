
public class Televisao {
    boolean ligada=false;
    boolean silencioso=false;
    int volume=0;
    int canal=0;
    void onOff(){
        if (ligada==false){
            ligada=true;
        }
        else{
            ligada=false;
        }
    }
    void mute(){
        if (silencioso==false){
            silencioso=true;
        }
        else{
            silencioso=false;
        }
    }
    void mudaCanalEspecifico(int canalNovo){
        if (canalNovo>99 | canalNovo<0){
            System.out.print("canal invalido\n");
        }
        else{
        canal=canalNovo;
        }
    }
    void mudaProximoCanal(){
        if (canal!=99){
            canal+=1;
        }
        else{
            System.out.print("comando invalido\n");
        }
    }
    void mudaAnteriorCanal(){
        if (canal!=0){
            canal-=1;
        }
        else{
            System.out.print("comando invalido\n");
        }
    }
    void aumentaVol(){
        if (volume!=10){
            volume+=1;
        }
        else{
            System.out.print("comando invalido\n");
        }
    }
    void diminuiVol(){
        if (volume!=0){
            volume-=1;
        }
        else{
            System.out.print("comando invalido\n");
        }
    }
}
