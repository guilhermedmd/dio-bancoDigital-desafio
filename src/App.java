public class App {
    public static void main(String[] args) throws Exception {
        Cliente titular = new Cliente("joao", "111.111.111-11", "11-11-2000");
        Conta cc = new ContaCorrente(titular);
        ContaPoupanca cp = new ContaPoupanca(titular);

        cc.depositar(1000);
        cc.transferir(900, cp);
        cc.exibirExtrato();
        System.out.println("----------------------");
        cp.depositar(1000);
        cp.rentimento();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {};
        cp.exibirExtrato();

        
    }
}
