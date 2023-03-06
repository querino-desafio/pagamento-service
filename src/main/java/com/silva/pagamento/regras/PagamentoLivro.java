package com.silva.pagamento.regras;

public class PagamentoLivro implements Pagamento {
    @Override
    public void processarPagamento() {
        //integrar com sistema externo, cartões ou outros
        System.out.println("Gera guia remessa duplicada para Royalties");
        System.out.println("Gera comissão ao agente");
    }
}
