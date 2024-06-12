package smartTV;

public class SmartTv {
    boolean ligada = false;
    int volume = 30;
    int canal = 11;

    public void ligar (){
        ligada = true;
    }
    public void desligar (){
        ligada = false;
    }
    public void aumentarVolume(){
        volume = volume + 10;
    }
    public void diminuirVolume(){
        --volume;
    }
    public void proximoCanal(){
        ++ canal;
    }
    public void voltarCanal(){
        -- canal;
    }
    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }
}
