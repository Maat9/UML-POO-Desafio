import aparelho.Iphone;

public class sistemaPrincipal {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();
        
        meuIphone.tocar();
        meuIphone.ligar();
        meuIphone.atualizarPagina();
        meuIphone.selecionarMusica();
    }
}
