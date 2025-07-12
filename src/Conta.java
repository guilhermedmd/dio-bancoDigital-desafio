import java.util.ArrayList;
import java.util.List;

public abstract class Conta {
    private double numero = Math.random();
    private String agencia = "122-32";
    private double saldo;
    private Cliente titular;

    List<Extrato> extrato = new ArrayList<>();

    
    public Cliente getTitular() {
        return titular;
    }

    public double getNumero() {
        return numero;
    }
    public String getAgencia() {
        return agencia;
    }
    public double getSaldo() {
        return saldo;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    // métodos da conta
    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public void depositar(double valor){
        this.saldo += valor;
        extrato.add(new Extrato(this.saldo));
    }

    public void sacar(double valor){
        if(this.saldo < valor){
            System.out.println("Erro: Valor maior que o saldo da conta");
            return;
        }else{
            this.saldo -= valor;
            extrato.add(new Extrato(this.saldo));
        }
        
    }

    public void transferir(double valor, Conta contaDestino){
        sacar(valor);
        contaDestino.depositar(valor);
        extrato.add(new Extrato(this.saldo));

        
    }

    public abstract void exibirExtrato();

    public List<Extrato> getExtrato() {
        return extrato;
    }

    

}
