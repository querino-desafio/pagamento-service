package com.silva.pagamento.regras;

public class PagamentoVideo implements Pagamento {
    @Override
    public void processarPagamento() {
        //integrar com sistema externo, cartões, etc
        System.out.println("Liberar acesso ao vídeo");
        System.out.println("Liberar vídeo relacionado");
    }
}
