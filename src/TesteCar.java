public class TesteCar {
    public static void main(String[] args) {
        ModeloCar meuCarro = new ModeloCar();
        meuCarro.definirModelo("Sedan");
        meuCarro.definirPrecos(30000, 32000, 35000);
        meuCarro.exibirInfo();
    }
}