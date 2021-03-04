public class Main {
    public static void main(String[] args) {
        Televisao tv = new Televisao();
        tv.onOff();
        tv.aumentaVol();
        tv.mudaCanalEspecifico(10);
        tv.mute();
        tv.mudaProximoCanal();
        System.out.print("o atual estado da tv é:\n");
        System.out.printf("ligada: %b\n",tv.ligada);
        System.out.printf("silenciada: %b\n",tv.silencioso);
        System.out.printf("volume: %d\n",tv.volume);
        System.out.printf("canal atual: %d\n",tv.canal);
    }
}
