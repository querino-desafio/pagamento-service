package com.silva.pagamento.regras_enum;

import com.silva.pagamento.regras.*;

import java.util.List;

public enum TipoPagamento {
    PRODUTO_FISICO {
        public List<String> processarPagamento() {
            pagamento = new PagamentoProdutoFisico();
            return pagamento.processarPagamento();
        }
    },
    LIVRO {
        public List<String> processarPagamento() {
            pagamento = new PagamentoLivro();
            return pagamento.processarPagamento();
        }
    },
    NOVA_ASSOCIACAO {
        public List<String> processarPagamento() {
            pagamento = new PagamentoNovaAssociacao();
            return pagamento.processarPagamento();
        }
    },
    UPGRADE_ASSOCIACAO {
        public List<String> processarPagamento() {
            pagamento = new PagamentoUpgradeAssociacao();
            return pagamento.processarPagamento();
        }
    },
    VIDEO() {
        public List<String> processarPagamento() {
            pagamento = new PagamentoVideo();
            return pagamento.processarPagamento();
        }
    };
    private static Pagamento pagamento;

    public abstract List<String> processarPagamento();
}
