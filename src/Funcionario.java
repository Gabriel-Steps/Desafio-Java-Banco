public class Funcionario {
    private int numeroIndentificacao;
    private String nomeFuncionario;
    
    public Funcionario(int numeroIndentificacao,String nomeFuncionario){
        this.numeroIndentificacao = numeroIndentificacao;
        this.nomeFuncionario = nomeFuncionario;
        System.out.println("Novo funcionário com o númerto de indentificação " + this.numeroIndentificacao + " e com o nome de " + this.nomeFuncionario);
    }

}
