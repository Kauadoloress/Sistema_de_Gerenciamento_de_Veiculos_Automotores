public abstract class Automovel {
    private String placa;
    private String marca;
    private int anoFabricacao;

    public Automovel() {

    }

    public Automovel(String placa, String marca, int anoFabricacao) {
        this.placa = placa;
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
    }

    abstract void exibirDetalhe();

    final void registrarManutencao(){
        System.out.println("Manutenção registrada!");
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}



