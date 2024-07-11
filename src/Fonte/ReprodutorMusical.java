package Fonte;

public class ReprodutorMusical {
	
	String album = "Tim Maia";
	String musica  = "Gostava tanto de você";
	
	
	public void selecionarReprodutorMusical() {
		System.out.println("Você está no AppleMusic!");
		
	}public void abrirAlbum() {
		System.out.println("Você está em album ");
		
	}
	
	public void selecionarAlbum() {
		System.out.println("Você selecionou: " + album);
		
	}
	public void selecionarMusica() {
		System.out.println("Você selecionou: " + musica);
		
	}
	public void tocar() {
		System.out.println("Sua música está tocando!");
		
	}

	public void pausar() {
		System.out.println("Sua música está pausada!");
		
	}
	public void voltarPagInicial() {
		System.out.println("Você voltou para biblioteca de Aplicativos!");
		
	}

	
	
	
	
	
	
	
}
