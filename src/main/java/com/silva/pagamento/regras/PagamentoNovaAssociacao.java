package com.silva.pagamento.regras;

public class PagamentoNovaAssociacao implements Pagamento {
    @Override
    public void processarPagamento() {
        //integrar com sistema externo, cartões ou outros
        System.out.println("Ativar associação");
        System.out.println("Envia e-mail ao proprietário");
    }
}
