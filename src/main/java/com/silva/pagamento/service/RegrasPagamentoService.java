package com.silva.pagamento.service;

import com.silva.pagamento.regras_enum.TipoPagamentoEnum;

import java.util.List;

public class RegrasPagamentoService {

    public List<String> processar(TipoPagamentoEnum tipoPagamento) {
        return tipoPagamento.processarPagamento();
    }
}
