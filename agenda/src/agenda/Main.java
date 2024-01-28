package agenda;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(">>>> Menu <<<< ");
            System.out.println("1 - Adicionar Contato");
            System.out.println("2 - Remover Contato");
            System.out.println("3 - Editar Contato");
            System.out.println("4 - Exibir Contatos");
            System.out.println("5 - Sair");

            int escolha = scanner.nextInt();
            scanner.nextLine();  

            switch (escolha) {
                case 1:
                    System.out.print("Digite o ID do contato: ");
                    Long id = scanner.nextLong();
                    scanner.nextLine();  
                    System.out.print("Digite o nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o sobrenome: ");
                    String sobreNome = scanner.nextLine();

                    Contato novoContato = new Contato(id, nome, sobreNome);

                    System.out.print("Digite a quantidade de telefones a adicionar: ");
                    int qtdTelefones = scanner.nextInt();
                    scanner.nextLine();  

                    for (int i = 0; i < qtdTelefones; i++) {
                        System.out.print("Digite o DDD do telefone " + (i + 1) + ": ");
                        String ddd = scanner.nextLine();
                        System.out.print("Digite o número do telefone " + (i + 1) + ": ");
                        Long numero = scanner.nextLong();
                        scanner.nextLine();  
                        novoContato.adicionarTelefone(ddd, numero);
                    }

                    agenda.adicionarContato(novoContato);
                    break;

                case 2:
                    System.out.print("Digite o ID do contato a ser removido: ");
                    Long idRemover = scanner.nextLong();
                    scanner.nextLine();  
                    agenda.removerContato(idRemover);
                    break;

                case 3:
                    System.out.print("Digite o ID do contato a ser editado: ");
                    Long idEditar = scanner.nextLong();
                    scanner.nextLine();  
                    System.out.print("Digite o novo nome: ");
                    String novoNome = scanner.nextLine();
                    System.out.print("Digite o novo sobrenome: ");
                    String novoSobreNome = scanner.nextLine();
                    agenda.editarContato(idEditar, novoNome, novoSobreNome);
                    break;

                case 4:
                    agenda.exibirContatos();
                    break;

                case 5:
                    System.out.println("Saindo da agenda. Até mais!");
                    System.exit(0);

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
