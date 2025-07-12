import java.time.LocalDate;

public  class Extrato {
    double saldoDoDia;
    LocalDate data = LocalDate.now();

    
    public Extrato(double saldo) {
        this.saldoDoDia = saldo;
    }


    @Override
    public String toString() {
        return "Extrato [saldoDoDia=" + saldoDoDia + ", data=" + data + "]";
    }

    
}
