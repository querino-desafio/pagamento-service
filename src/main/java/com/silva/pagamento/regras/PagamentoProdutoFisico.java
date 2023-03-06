package com.silva.pagamento.regras;

public class PagamentoProdutoFisico implements Pagamento {
    @Override
    public void processarPagamento() {
        //integrar com sistema externo, cartões, etc
        System.out.println("Gera guia de remessa para envio");
        System.out.println("Gera comissão ao agente");
    }
}
