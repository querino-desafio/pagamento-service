package com.silva.pagamento.regras_enum;

import com.silva.pagamento.regras.*;

import java.util.List;

public enum TipoPagamentoEnum {
    PRODUTO_FISICO {
        public List<String> processarPagamento() {
            pagamentoContext = new PagamentoContext(new PagamentoProdutoFisico());
            return pagamentoContext.processarPagamento();
        }
    },
    LIVRO {
        public List<String> processarPagamento() {
            pagamentoContext = new PagamentoContext(new PagamentoLivro());
            return pagamentoContext.processarPagamento();
        }
    },
    NOVA_ASSOCIACAO {
        public List<String> processarPagamento() {
            pagamentoContext = new PagamentoContext(new PagamentoNovaAssociacao());
            return pagamentoContext.processarPagamento();
        }
    },
    UPGRADE_ASSOCIACAO {
        public List<String> processarPagamento() {
            pagamentoContext = new PagamentoContext(new PagamentoUpgradeAssociacao());
            return pagamentoContext.processarPagamento();
        }
    },
    VIDEO() {
        public List<String> processarPagamento() {
            pagamentoContext = new PagamentoContext(new PagamentoVideo());
            return pagamentoContext.processarPagamento();
        }
    };
    private static PagamentoContext pagamentoContext;

    public abstract List<String> processarPagamento();
}
