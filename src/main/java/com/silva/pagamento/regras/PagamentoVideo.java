package com.silva.pagamento.regras;

import java.util.ArrayList;
import java.util.List;

public class PagamentoVideo implements Pagamento {
    public static final List<String> processamentos = new ArrayList<>();

    @Override
    public List<String> processarPagamento() {
        //integrar com sistema externo, cartões, etc
        System.out.println("Liberar acesso ao vídeo");
        processamentos.add("VIDEO");
        System.out.println("Liberar vídeo relacionado");
        processamentos.add("VIDEO_RELACIONADO");
        return processamentos;
    }
}
