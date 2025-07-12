public class ContaCorrente extends Conta{    
    
   public ContaCorrente(Cliente titular){
        super.setTitular(titular);
        super.setSaldo(0);

   }

   @Override
   public void exibirExtrato() {
    System.out.println("======Extrato Conta Corrente======");
    System.out.println("Titular: "+super.getTitular());
    super.getExtrato().stream().forEach(e -> System.out.println(e));
   }


    
}
