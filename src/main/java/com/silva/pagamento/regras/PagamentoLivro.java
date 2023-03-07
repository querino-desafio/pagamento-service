package com.silva.pagamento.regras;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class PagamentoLivro implements Pagamento {

    public static final List<String> processamentos = new ArrayList<>();

    @Override
    public List<String> processarPagamento() {
        //integrar com sistema externo, cartões ou outros
        log.info("Gera guia remessa duplicada para Royalties");
        processamentos.add("ROYALTIES");
        log.info("Gera comissão ao agente");
        processamentos.add("COMISSAO");
        return processamentos;
    }
}
