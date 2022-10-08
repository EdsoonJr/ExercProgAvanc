package Atv18;

import java.util.List;

public class Funcionario {
    private List<PedidoBasico> realizaPedidos;

    
    public void listarPediso(){
        System.out.println("Listando os pedidos");
    }

    public void editarPedido(){
        System.out.println("Editando os pedidos");
    }

    public List<PedidoBasico> getrealizaPedidos() {
        return realizaPedidos;
    }

    public void setPedidoBasicos(List<PedidoBasico> realizaPedidos) {
        this.realizaPedidos = realizaPedidos;
    }

}
