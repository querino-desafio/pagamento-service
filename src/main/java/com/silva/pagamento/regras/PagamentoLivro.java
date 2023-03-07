package com.silva.pagamento.regras;

import java.util.ArrayList;
import java.util.List;

public class PagamentoLivro implements Pagamento {

    public static final List<String> processamentos = new ArrayList<>();

    @Override
    public List<String> processarPagamento() {
        //integrar com sistema externo, cartões ou outros
        System.out.println("Gera guia remessa duplicada para Royalties");
        processamentos.add("ROYALTIES");
        System.out.println("Gera comissão ao agente");
        processamentos.add("COMISSAO");
        return processamentos;
    }
}
