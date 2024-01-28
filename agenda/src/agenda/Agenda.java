package agenda;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

class Agenda {
    private List<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        if (!contatoJaExiste(contato.getId()) && !telefoneJaCadastrado(contato)) {
            contatos.add(contato);
            salvarDados();
            System.out.println("Contato adicionado com sucesso!");
        } else {
            System.out.println("Erro: Contato com mesmo ID ou telefone já cadastrado.");
        }
    }

    public void removerContato(Long id) {
        contatos.removeIf(contato -> contato.getId().equals(id));
        salvarDados();
        System.out.println("Contato removido com sucesso!");
    }

    public void editarContato(Long id, String novoNome, String novoSobreNome) {
        for (Contato contato : contatos) {
            if (contato.getId().equals(id)) {
                contato.setNome(novoNome);
                contato.setNome(novoSobreNome);
                salvarDados();
                System.out.println("Contato editado com sucesso!");
                return;
            }
        }
        System.out.println("Erro: Contato não encontrado.");
    }

    private boolean contatoJaExiste(Long id) {
        for (Contato contato : contatos) {
            if (contato.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    private boolean telefoneJaCadastrado(Contato novoContato) {
        for (Contato contato : contatos) {
            for (Telefone telefone : novoContato.getTelefones()) {
                if (contato.possuiTelefone(telefone.getDdd(), telefone.getNumero())) {
                    return true;
                }
            }
        }
        return false;
    }

    public void exibirContatos() {
        System.out.println(">>>> Contatos <<<< ");
        System.out.println("Id | Nome");
        for (Contato contato : contatos) {
            System.out.println(contato.getId() + "  | " + contato.getNome());
        }
    }

    private void salvarDados() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("contatos.txt"))) {
            for (Contato contato : contatos) {
                writer.println(contato.getId() + "," + contato.getNome() + "," + contato.getNome());
                for (Telefone telefone : contato.getTelefones()) {
                    writer.println("," + telefone.getDdd() + "," + telefone.getNumero());
                }
                writer.println();  // linha em branco entre contatos
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
