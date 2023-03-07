package com.silva.pagamento.regras;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class PagamentoNovaAssociacao implements Pagamento {
    public static final List<String> processamentos = new ArrayList<>();

    @Override
    public List<String> processarPagamento() {
        //integrar com sistema externo, cartões ou outros
        log.info("Ativar associação");
        processamentos.add("ASSOCIACAO");
        log.info("Envia e-mail ao proprietário");
        processamentos.add("EMAIL");
        return processamentos;
    }
}
