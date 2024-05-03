public class Usuario{

    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        System.out.println("A TV esta ligada ? " + smartTv.ligada);
        System.out.println("Qual o canal atual ? " + smartTv.canal);
        System.out.println("Qual o volume atual ? " + smartTv.volume);
        smartTv.ligar();
        System.out.println("Novo status --> A tv esta ligada ?" + smartTv.ligada);
        smartTv.aumentarVolume();
        System.out.println("Novo status --> Qual o volume atual ? " + smartTv.volume);
        smartTv.aumentarVolume();
        System.out.println("Novo status --> Qual o volume atual ? " + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("Novo status --> Qual o volume atual ? " + smartTv.volume);
        smartTv.mudarCanal(3);
        System.out.println("Qual o canal atual ? " + smartTv.canal);
    }
}