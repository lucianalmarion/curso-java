// Classe de Teste
public class TesteNumerosPrimos {
    public static void main(String[] args) {
        VerificandoPrimo verificador = new VerificandoPrimo();
        verificador.verificarSeEhPrimo(17);

        GerandoPrimo gerador = new GerandoPrimo();
        int proximoPrimo = gerador.gerarProximoPrimo(17);
        System.out.println("O próximo primo após 17 é: " + proximoPrimo);

        NumerosPrimos numerosPrimos = new NumerosPrimos();
        numerosPrimos.listarPrimos(30);
    }
}