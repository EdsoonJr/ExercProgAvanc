public class Usuario {
    
    private String login;
    private String senha;
    private String permissao;
    private Colaborador colaborador;

    public void editarPerfil() {
        System.out.println("Método Editar Perfil");
    };
    public void alterarSenha(){
        System.out.println("Método Alterar Senha");
    };
    public void criarUsuario() {
        System.out.println("Método Criar Usuário");
    };

    public void apagarUsuario() {
        System.out.println("Método Apagar Usuário");
    }


    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getPermissao() {
        return permissao;
    }
    public void setPermissao(String permissao) {
        this.permissao = permissao;
    }
    public Colaborador getColaborador() {
        return colaborador;
    }
    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    };

    
}
