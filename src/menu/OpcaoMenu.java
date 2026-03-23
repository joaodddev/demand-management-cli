package menu;

public class OpcaoMenu {

    private int codigo;
    private String descricao;
    private Acao acao;

    public OpcaoMenu(int codigo, String descricao, Acao acao) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.acao = acao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void executar() {
        acao.executar();
    }
}