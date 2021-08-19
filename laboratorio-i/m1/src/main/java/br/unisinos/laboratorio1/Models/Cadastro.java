package br.unisinos.laboratorio1.Models;

public class Cadastro {
    private String nome;
    private String cpf;
    private String estadoCivil;
    private char sexo;
    private String genero;
    private int idade;
    private String numeroCNH;
    private char tipoVeiculo;
    private String modeloVeiculo;
    private double valorFreteMinimo;
    private boolean trabalhaFDS;
    
    /**
     * @param nome
     * @param cpf
     * @param estadoCivil
     * @param sexo
     * @param genero
     * @param idade
     * @param numeroCNH
     * @param tipoVeiculo
     * @param modeloVeiculo
     * @param valorFreteMinimo
     * @param trabalhaFDS
     */
    public Cadastro(String nome, String cpf, String estadoCivil, char sexo, String genero, int idade, String numeroCNH,
            char tipoVeiculo, String modeloVeiculo, double valorFreteMinimo, boolean trabalhaFDS) {
        this.nome = nome;
        this.cpf = cpf;
        this.estadoCivil = estadoCivil;
        this.sexo = sexo;
        this.genero = genero;
        this.idade = idade;
        this.numeroCNH = numeroCNH;
        this.tipoVeiculo = tipoVeiculo;
        this.modeloVeiculo = modeloVeiculo;
        this.valorFreteMinimo = valorFreteMinimo;
        this.trabalhaFDS = trabalhaFDS;
    }

    /**
     * @return the trabalhaFDS
     */
    public boolean isTrabalhaFDS() {
        return trabalhaFDS;
    }

    /**
     * @param trabalhaFDS the trabalhaFDS to set
     */
    public void setTrabalhaFDS(boolean trabalhaFDS) {
        this.trabalhaFDS = trabalhaFDS;
    }

    public Cadastro() {}

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the estadoCivil
     */
    public String getEstadoCivil() {
        return estadoCivil;
    }

    /**
     * @param estadoCivil the estadoCivil to set
     */
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    /**
     * @return the sexo
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the numeroCNH
     */
    public String getNumeroCNH() {
        return numeroCNH;
    }

    /**
     * @param numeroCNH the numeroCNH to set
     */
    public void setNumeroCNH(String numeroCNH) {
        this.numeroCNH = numeroCNH;
    }

    /**
     * @return the tipoVeiculo
     */
    public char getTipoVeiculo() {
        return tipoVeiculo;
    }

    /**
     * @param tipoVeiculo the tipoVeiculo to set
     */
    public void setTipoVeiculo(char tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    /**
     * @return the modeloVeiculo
     */
    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    /**
     * @param modeloVeiculo the modeloVeiculo to set
     */
    public void setModeloVeiculo(String modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }

    /**
     * @return the valorFreteMinimo
     */
    public double getValorFreteMinimo() {
        return valorFreteMinimo;
    }

    /**
     * @param valorFreteMinimo the valorFreteMinimo to set
     */
    public void setValorFreteMinimo(double valorFreteMinimo) {
        this.valorFreteMinimo = valorFreteMinimo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("\nNome: " + this.nome)
            .append("\nCPF: " + this.cpf)
            .append("\nEstado Civil: " + this.estadoCivil)
            .append("\nSexo: " + this.sexo == "F" ? "Feminino" : "Masculino")
            .append("\nGênero: " + this.genero)
            .append("\nIdade: " + this.idade)
            .append("\nCNH: " + this.numeroCNH)
            .append("\nTipo Veiculo: " + this.tipoVeiculo == "C" ? "Carro" : (this.tipoVeiculo == 'M' ? "Moto" : "Bicicleta"))
            .append("\nModelo: " + this.modeloVeiculo)
            .append("\nFrete Minimo: R$ " + this.valorFreteMinimo)
            .append(String.format("\nTrabalha nos Finais de Semana %s", this.trabalhaFDS == true ? "Sim" : "Não"));    

        return sb.toString();
    }
}
