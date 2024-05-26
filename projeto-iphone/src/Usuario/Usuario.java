package Usuario;
import Aplicativos.Phone;
import Aplicativos.Ipod;
import Aplicativos.Browser;
import Aplicativos.Iphone.Iphone;

public class Usuario {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();

        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
    
}
