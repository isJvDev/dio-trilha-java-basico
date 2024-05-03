public class SmartTv {
    boolean ligada = false; //Tv inicia desligada.
    int canal = 1; //Tv inica no canal 1.
    int volume = 25; //TV inicia com o volume no 25.

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada= false;
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Abaixando o volume para " + volume);
    }
    public void diminuirVolume(){
        volume--;

    }
     public void mudarCanal(int escolherCanal){
        canal= escolherCanal;
     }
    
}
