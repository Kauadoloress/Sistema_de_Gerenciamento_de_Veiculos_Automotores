public class Carro extends Automovel implements AutomovelTerrestre {
    public int portas;


    public Carro(){

    }

    public Carro(String placa,  String marca ,int anoFabricacao,int portas){
        super(placa, marca,anoFabricacao);
        this.portas = portas;
    }


    void ligarRadio(){
        System.out.println("Radio Ligada");
    }

    void ligarRadio(String estacao){
        System.out.println("Radio está na estação " + estacao);
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando carro!!");
    }

    @Override
    void exibirDetalhe() {
        System.out.println("Automovel: Carro\nPlaca: " + getPlaca() + "\nMarca: " + getMarca() + "\nAno de fabricação: " + getAnoFabricacao());
        acelerar();
    }
}
