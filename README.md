# Projeto-Agenda de Contatos Java

Este é um projeto simples de uma agenda de contatos em Java, utilizando classes para representar contatos, telefones e a agenda em si. O armazenamento dos dados é feito em arquivos de texto, simulando uma base de dados.

# Estrutura do Projeto
O projeto é dividido em três classes principais:

# Contato: 
Representa um contato na agenda. Cada contato possui um ID único, nome, sobrenome e uma lista de telefones.
java

public class Contato {
    private Long id;
    private String nome;
    private String sobreNome;
    private List<Telefone> telefones;
    // ...
}
# Telefone
Representa um número de telefone, contendo DDD e número.
java

public class Telefone {
    private String ddd;
    private Long numero;
    // ...
}
# Agenda:
Gerencia a lista de contatos e realiza operações como adicionar, remover, editar, exibir contatos, e salvar dados em arquivos de texto.
java

public class Agenda {
    private List<Contato> contatos;
    // ...
}
# Requisitos Não-Funcionais
Utilização de arquivos de texto para armazenar os dados (simulação de base de dados).
Requisitos Funcionais
RN1: Não é permitido armazenar contatos com o mesmo ID.
RN2: Não é permitido armazenar contatos com telefones já cadastrados.
RN3: Para realizar as ações, é necessário informar o ID do contato.
# Funcionalidades
Adicionar Contato
Remover Contato
Editar Contato
Exibir Contatos
Sair
# Como Executar
Compile os arquivos Java: javac Main.java
Execute o programa: java Main
Contribuições
Sinta-se à vontade para contribuir com melhorias ou correções. Abra um problema (issue) ou envie um pull request com as suas alterações.

# Licença
Este projeto está licenciado sob a MIT License.
