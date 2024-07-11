# Projeto iPhone

Este projeto representa a modelagem UML do componente iPhone, abrangendo suas funcionalidades como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

 ## Diagrama UML

```mermaid
classDiagram
    class Iphone {
        +main(String[] args)
    }

    class ReprodutorMusical {
        -String album = "Tim Maia"
        -String musica = "Gostava tanto de você"
        +selecionarReprodutorMusical()
        +abrirAlbum()
        +selecionarAlbum()
        +selecionarMusica()
        +tocar()
        +pausar()
        +voltarPagInicial()
    }

    class Chamadas {
        +selecionarChamadas()
        +recebendoChamada()
        +ligar()
        +atender()
        +desligar()
        +recebendoOutraChamada()
        +chamadaEmEspera()
        +iniciarCorreioVoz()
        +voltarPagInicial()
    }

    class Safari {
        +selecionarSafari()
        +exibirPagina()
        +novaAba()
        +atulizarPagina()
        +voltarPagInicial()
    }

    Iphone --> ReprodutorMusical : utiliza
    Iphone --> Chamadas : utiliza
    Iphone --> Safari : utiliza
