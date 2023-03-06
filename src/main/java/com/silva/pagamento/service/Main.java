package com.silva.pagamento.service;

import com.silva.pagamento.regras_enum.TipoPagamentoEnum;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> processados = new RegrasPagamentoService().processar(TipoPagamentoEnum.LIVRO);
        System.out.println("Processados: " + processados);
    }
}
