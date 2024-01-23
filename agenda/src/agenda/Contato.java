package agenda;

import java.util.ArrayList;
import java.util.List;

public class Contato {
    private Long id;
    private String nome;
    private String sobreNome;
    private List<Telefone> telefones;

    public Contato(Long id, String nome, String sobreNome) {
        this.id = id;
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.telefones = new ArrayList<>();
    }

    // Getters and Setters

    public void adicionarTelefone(String ddd, Long numero) {
        Telefone telefone = new Telefone(ddd, numero);
        telefones.add(telefone);
    }

    public boolean possuiTelefone(String ddd, Long numero) {
        for (Telefone telefone : telefones) {
            if (telefone.getDdd().equals(ddd) && telefone.getNumero().equals(numero)) {
                return true;
            }
        }
        return false;
    }
}

