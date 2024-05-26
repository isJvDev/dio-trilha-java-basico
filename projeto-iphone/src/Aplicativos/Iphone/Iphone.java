package Aplicativos.Iphone;
import Aplicativos.Browser;
import Aplicativos.Ipod;
import Aplicativos.Phone;   

public class Iphone implements Browser, Ipod, Phone{
    public void tocar(){
        System.out.println("TOCANDO MÚSICA VIA IPHONE");
    }
    public void pausar(){
        System.out.println("MÚSICA PAUSADA VIA IPHONE");
    }
    public void selecionarMusica(){
        System.out.println("SELECIONANDO MÚSICA VIA IPHONE");
    }
    public void ligar(){
        System.out.println("LIGANDO VIA IPHONE");
    }
    public void atender(){
        System.out.println("ATENDENDO VIA IPHONE");
    }
    public void iniciarCorreioVoz(){
        System.out.println("ABRINDO CORREIO DE VOZ VIA IPHONE");
    }
    public void exibirPagina(){
        System.out.println("EXIBINDO PAGINA WEB VIA IPHONE");
    }
    public void adicionarNovaAba(){
        System.out.println("ADICIONANDO NOVA PAGINA VIA IPHONE");
    }
    public void atualizarPagina(){
        System.out.println("ATUALIZANDO PAGINA VIA IPHONE");
    }
}