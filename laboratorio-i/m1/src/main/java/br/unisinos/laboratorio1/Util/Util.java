package br.unisinos.laboratorio1.Util;

public class Util {

    /**
     * Converter uma string para inteiro
     * @param str
     * @return
     */
    public static int parseStringToInt(String str) {
        int value = 0;

        try {
            value = Integer.valueOf(str);
        } catch (Exception ex) {
            System.out.println(String.format("Erro ao converter string [%s]", str));
        }

        return value;
    }
}
