package projetos.smartTv;

public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        System.out.println("A televisão está ligada? " + smartTv.ligada);
        System.out.println("O volume atual é: " + smartTv.volume);
        System.out.println("O canal atual é: " + smartTv.canal);

        smartTv.ligar();
        System.out.println("A televisão está ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("O volume foi aumentado e atualmente está em: " + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("O volume foi diminuido e atualmente está em: " + smartTv.volume);

        smartTv.proximoCanal();
        System.out.println("O canal atual é: " + smartTv.canal);
        smartTv.mudarCanal(8);
        smartTv.voltarCanal();
        System.out.println("O canal atual é: " + smartTv.canal);
    }

}
