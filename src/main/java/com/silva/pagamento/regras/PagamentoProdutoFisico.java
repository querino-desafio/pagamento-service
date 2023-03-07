package com.silva.pagamento.regras;

import java.util.ArrayList;
import java.util.List;

public class PagamentoProdutoFisico implements Pagamento {
    public static final List<String> processamentos = new ArrayList<>();

    @Override
    public List<String> processarPagamento() {
        //integrar com sistema externo, cartões, etc
        System.out.println("Gera guia de remessa para envio");
        processamentos.add("ENVIO");
        System.out.println("Gera comissão ao agente");
        processamentos.add("COMISSAO");

        return processamentos;
    }
}
