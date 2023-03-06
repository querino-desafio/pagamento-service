package com.silva.pagamento.regras;

import java.util.List;

public class PagamentoContext {
    Pagamento pagamento;

    public PagamentoContext(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public List<String> processarPagamento() {
        return pagamento.processarPagamento();
    }
}
