package aparelho;

import aparelho.funcionalidades.ReprodutorMusical;
import aparelho.funcionalidades.AparelhoTelefônico;
import aparelho.funcionalidades.NavegadorNaInternet;

public class Iphone implements ReprodutorMusical, AparelhoTelefônico, NavegadorNaInternet {
    
       public void tocar() {
           System.out.println("Reproduzindo música...");
       }
   
       public void pausar() {
           System.out.println("Música pausada.");
       }
   
       public void selecionarMusica() {
           System.out.println("Música selecionada.");
       }
   
       public void ligar() {
           System.out.println("Fazendo ligação...");
       }

       public void atender() {
           System.out.println("Atendendo chamada...");
       }

       public void iniciarCorreioVoz() {
           System.out.println("Iniciando correio de voz.");
       }
   
       public void exibirPagina() {
           System.out.println("Exibindo página." );
       }

       public void adicionarNovaAba() {
           System.out.println("Adicionando nova aba.");
       }

       public void atualizarPagina() {
           System.out.println("Atualizando página.");
       }
}
