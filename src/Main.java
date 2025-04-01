public class Main {
    public static void main(String[] args) {
        Automovel []automovel = new Automovel[2];

        automovel[0] = new Carro("AB2432", "Ferrari",2020, 2);
        automovel[1] = new CaminhaoImportado("CQ0993","Volkswagen", 2017, 100.90);

        for (Automovel automovel1 : automovel){
            if (automovel1 instanceof Carro){
                Carro car = (Carro) automovel1;
                car.exibirDetalhe();
                car.ligarRadio();
                car.ligarRadio("Metropolitana");
                if (car.getAnoFabricacao() <= 2018){
                    car.registrarManutencao();
                }
            }

            System.out.println("-----------------------");

            if (automovel1 instanceof CaminhaoImportado){
                CaminhaoImportado caminhaoImportado = (CaminhaoImportado) automovel1;
                caminhaoImportado.exibirDetalhe();
                System.out.println("TAxa de importação: " + caminhaoImportado.taxaImportacao(1000.00));
                caminhaoImportado.acelerar();
                if (caminhaoImportado.getAnoFabricacao() <= 2018){
                    caminhaoImportado.registrarManutencao();
                }
            }


        }
    }
}
