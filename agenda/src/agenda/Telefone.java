package agenda;

public class Telefone {
    private String ddd;
    private Long numero;

    public Telefone(String ddd, Long numero) {
        this.ddd = ddd;
        this.numero = numero;
    }

    // Getters and Setters

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public java.lang.Long getNumero() {
        return numero;
    }

    public void setNumero(java.lang.Long numero) {
        this.numero = numero;
    }
}
