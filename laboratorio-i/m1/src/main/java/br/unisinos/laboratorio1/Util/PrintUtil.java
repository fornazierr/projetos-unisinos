package br.unisinos.laboratorio1.Util;

import java.util.List;

import br.unisinos.laboratorio1.Models.Cadastro;

public class PrintUtil {

    /**
     * Imprime um separador entre os diálogos
     */
    public static void printSeparator() {
        System.out.println("\n==============================");
    }

    /**
     * Imprime a mensagem inicial do sistema
     */
    public static void printHome() {
        printSeparator();
        System.out.println("Bem Vindo ao Sistema de Cadastros das Babara");
        printSeparator();
    }

    public static void printInfoEmpresa() {
        StringBuilder sb = new StringBuilder();

        sb.append("\n========== Babara ==========")
        .append("\nA Babara é uma empresa de que fornece serviços de")
        .append("\nentrega feita por pessoas físicas para pessoas")
        .append("\nfísicas com a total responsbilidade de proporcionar")
        .append("\ntanto para funcionário como cliente, a melhor")
        .append("\nexperiência de entrega possível.");

        System.out.println(sb.toString());
    }
    /**
     * Imprime mesnagem  de opção invalisa
     */
    public static void prinOpcaoInvalida(){
        System.out.println("Opção inválida, escolha conforme informado abaixo!\n============================");
    }

    /**
     * Mensagem de esolha entre cadastrar usuario ou sair do sistema
     */
    public static void printHomeChoises() {
        StringBuilder sb = new StringBuilder();

        sb.append("\nEcolha a seguir a ação deseja inserindo o numero relativo")
        .append("\n1 - Cadastrar Novo Usuário")
        .append("\n2 - Imprimir Usuários")
        .append("\n3 - Informação do Sistema/Empresa")
        .append("\n4 - Sair do Sistema")
        .append("\n==============================");

        System.out.println(sb.toString());
    }

    /**
     * Mensagem ao sair do sistema
     */
    public static void printMensagemSaidaSistema() {
        System.out.println("Obrigado por utilizar nosso sistema.\nVolte Sempre!");
    }

    /**
     * 
     * @param cadastros
     */
    public static void printUsuarios(List<Cadastro> cadastros) {
        printSeparator();

        if (cadastros.isEmpty()) {
            System.out.println("Sem cadastros adicionados.");
        } else {
            cadastros.forEach(cadastro -> {
                System.out.println(cadastro.toString());
            });
        }

        printSeparator();
    }   
}
