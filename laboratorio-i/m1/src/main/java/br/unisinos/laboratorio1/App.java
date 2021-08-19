package br.unisinos.laboratorio1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import br.unisinos.laboratorio1.Util.CadastroUtil;
import br.unisinos.laboratorio1.Util.PrintUtil;
import br.unisinos.laboratorio1.Util.Util;
import br.unisinos.laboratorio1.Models.Cadastro;

/**
 * Hello world!
 *
 */
public class App {
    private static InputStreamReader i = new InputStreamReader (System.in);
    private static BufferedReader d = new BufferedReader(i);
    

    public static void main( String[] args ){
        List<Cadastro> cadastros = new ArrayList<>();
        try {
            PrintUtil.printHome();
            do {
                PrintUtil.printHomeChoises();
                int op = Util.parseStringToInt(d.readLine());
                if (op == 1) {
                    Cadastro cadastro = CadastroUtil.doCadastro();
                    cadastros.add(cadastro);
                } else if (op == 2) {
                    PrintUtil.printUsuarios(cadastros);
                } else if (op == 3) {
                    PrintUtil.printInfoEmpresa();
                    System.out.println("Presione ENTER para continar...");
                    d.readLine();
                    PrintUtil.printSeparator();
                    continue;
                } else if (op == 4) {
                    PrintUtil.printMensagemSaidaSistema();
                    System.exit(0);
                } else {
                    PrintUtil.prinOpcaoInvalida();
                    continue;
                }
            } while (true);
        } catch (Exception e) {
            System.out.println("Erro ao durante execução do programa.\n" + e.getMessage());
        } 
    }
}
