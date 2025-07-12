public class Cliente {
    private String nome, cpf, dataNasc;

    public Cliente(String nome, String cpf, String dataNasc) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
    }
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getDataNasc() {
        return dataNasc;
    }
    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", cpf=" + cpf + ", dataNasc=" + dataNasc + "]";
    }
    

    
}
