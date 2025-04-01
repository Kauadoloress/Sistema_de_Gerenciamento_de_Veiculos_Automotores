public class CaminhaoImportado extends Automovel implements AutomovelTerrestre, AutomovelImportado{
    double capacidadeCargas;

    public CaminhaoImportado(){

    }

    public CaminhaoImportado(String placa, String marca, int anoFabricacao, double capacidadeCargas) {
        super(placa, marca, anoFabricacao);
        this.capacidadeCargas = capacidadeCargas;
    }

    @Override
    public double taxaImportacao(double valueBase) {
        return 0;
    }
    @Override
    void exibirDetalhe() {
        System.out.println("Automovel: Caminhão\nPlaca: " + getPlaca() + "\nMarca: " + getMarca() + "\nAno de fabricação: " + getAnoFabricacao() + "\nCapacidade de cargas: " + capacidadeCargas );
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando a carreta!!!");
    }
}
