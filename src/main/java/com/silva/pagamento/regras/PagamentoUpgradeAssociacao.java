package com.silva.pagamento.regras;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class PagamentoUpgradeAssociacao implements Pagamento {
    public static final List<String> processamentos = new ArrayList<>();

    @Override
    public List<String> processarPagamento() {
        //integrar com sistema externo, cartões, etc
        log.info("Aplicar upgrade");
        processamentos.add("UPGRADE");
        return processamentos;
    }
}
