package com.silva.pagamento.regras;

import java.util.ArrayList;
import java.util.List;

public class PagamentoNovaAssociacao implements Pagamento {
    public static final List<String> processamentos = new ArrayList<>();

    @Override
    public List<String> processarPagamento() {
        //integrar com sistema externo, cartões ou outros
        System.out.println("Ativar associação");
        processamentos.add("ASSOCIACAO");
        System.out.println("Envia e-mail ao proprietário");
        processamentos.add("EMAIL");
        return processamentos;
    }
}
