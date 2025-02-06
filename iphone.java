public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    
    private String modelo;
    private String versaoSO;
    private String cor;
    
    // Construtor
    public iPhone(String modelo, String versaoSO, String cor) {
        this.modelo = modelo;
        this.versaoSO = versaoSO;
        this.cor = cor;
    }
    
    // Implementação do ReprodutorMusical
    @Override
    public void tocarMusica() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada.");
    }

    @Override
    public void pararMusica() {
        System.out.println("Música parada.");
    }

    // Implementação do AparelhoTelefonico
    @Override
    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para: " + numero);
    }

    @Override
    public void atenderChamada() {
        System.out.println("Chamada atendida.");
    }

    @Override
    public void desligarChamada() {
        System.out.println("Chamada desligada.");
    }

    // Implementação do NavegadorInternet
    @Override
    public void abrirPaginaWeb(String url) {
        System.out.println("Abrindo a página: " + url);
    }

    @Override
    public void fecharPaginaWeb() {
        System.out.println("Página fechada.");
    }

    @Override
    public void navegarParaURL(String url) {
        System.out.println("Navegando para: " + url);
    }
    
    // Métodos adicionais
    public void exibirInfo() {
        System.out.println("Modelo: " + modelo + ", SO: " + versaoSO + ", Cor: " + cor);
    }
}
