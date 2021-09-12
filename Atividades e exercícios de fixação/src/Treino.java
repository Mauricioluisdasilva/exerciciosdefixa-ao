public class Treino {
    private String nomeatleta;
    private double marcas;
    private double tempo;
    private int numero;

    public void setnomeatleta(String nomeatleta) {
        this.nomeatleta = nomeatleta;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setMarcas(double marcas) {
        this.marcas = marcas;
    }
    
    public String getNomeatleta(){
        return nomeatleta;
    }
    public double getTempo(){
        return tempo;
    }
    public int getNumero() {
        return numero;
    }

    public Treino calcularMediaDeMarcas() {
        return null;
    }

    public Treino obterMaiorMarca() {
        return null;
    }
}