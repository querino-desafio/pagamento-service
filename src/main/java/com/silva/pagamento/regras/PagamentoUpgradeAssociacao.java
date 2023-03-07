package com.silva.pagamento.regras;

import java.util.ArrayList;
import java.util.List;

public class PagamentoUpgradeAssociacao implements Pagamento {
    public static final List<String> processamentos = new ArrayList<>();

    @Override
    public List<String> processarPagamento() {
        //integrar com sistema externo, cartões, etc
        System.out.println("Aplicar upgrade");
        processamentos.add("UPGRADE");
        return processamentos;
    }
}
