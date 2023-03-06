package com.silva.pagamento.regras;

public class PagamentoUpgradeAssociacao implements Pagamento {
    @Override
    public void processarPagamento() {
        //integrar com sistema externo, cartões, etc
        System.out.println("Aplicar upgrade");
    }
}
