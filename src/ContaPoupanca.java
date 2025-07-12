public class ContaPoupanca extends Conta{
    
    public ContaPoupanca(Cliente titular){
        super.setTitular(titular);
        super.setSaldo(0);

   }

    public void rentimento(){
        // implementação do Runnable, rende 1% a cada 3min
        Thread ThreadRendimento = new Thread(()->{
                try {
                    Thread.sleep(180000);
                    double rendimento = this.getSaldo() * 0.01;
                    this.depositar(rendimento);
                } catch (InterruptedException e) {
                    
                } 
            });
        ThreadRendimento.start();        
    }

   @Override
   public void exibirExtrato() {
    System.out.println("======Extrato Conta Poupança======");
    super.getExtrato().stream().forEach(e -> System.out.println(e));
    
   }
}
