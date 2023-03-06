package com.silva.pagamento.regras_enum;

import com.silva.pagamento.regras.*;

public enum TipoPagamentoEnum {
    PRODUTO_FISICO {
        public void processarPagamento() {
            pagamento = new PagamentoProdutoFisico();
            pagamento.processarPagamento();
        }
    },
    LIVRO {
        public void processarPagamento() {
            pagamento = new PagamentoLivro();
            pagamento.processarPagamento();
        }
    },
    NOVA_ASSOCIACAO {
        public void processarPagamento() {
            pagamento = new PagamentoNovaAssociacao();
            pagamento.processarPagamento();
        }
    },
    UPGRADE_ASSOCIACAO {
        public void processarPagamento() {
            pagamento = new PagamentoUpgradeAssociacao();
        }
    },
    VIDEO() {
        public void processarPagamento() {
            pagamento = new PagamentoVideo();
            pagamento.processarPagamento();
        }
    };
    private static Pagamento pagamento;

    abstract void processarPagamento();

    //TODO: Testar por aqui
    public static void main(String[] args) {
        for(TipoPagamentoEnum item: TipoPagamentoEnum.values()){
            item.processarPagamento();
        }
    }
}
