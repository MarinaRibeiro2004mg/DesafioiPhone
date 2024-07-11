package Fonte;

public class Iphone {

	public static void main(String[] args) {
		
		ReprodutorMusical reprodutormusical = new ReprodutorMusical();
		
		
		reprodutormusical.selecionarReprodutorMusical();
		reprodutormusical.abrirAlbum();
		reprodutormusical.selecionarAlbum();
		reprodutormusical.selecionarMusica();
		reprodutormusical.tocar();
		reprodutormusical.pausar();
		reprodutormusical.voltarPagInicial();
		
	
		Chamadas chamadas = new Chamadas();
		
		chamadas.selecionarChamadas();
		chamadas.ligar();
		chamadas.atender();
		chamadas.desligar();
		chamadas.recebendoChamada();
		chamadas.atender();
		chamadas.recebendoOutraChamada();
		chamadas.chamadaEmEspera();
		chamadas.desligar();
		chamadas.iniciarCorreioVoz();
		chamadas.voltarPagInicial();
		
		
		Safari safari = new Safari();
		
		
		safari.selecionarSafari();
		safari.exibirPagina();
		safari.novaAba();
		safari.atulizarPagina();
		safari.voltarPagInicial();
 
 
 
 
 
 
 
 
 
 
    }
}
