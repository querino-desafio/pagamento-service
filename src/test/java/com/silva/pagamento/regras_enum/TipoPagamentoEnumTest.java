package com.silva.pagamento.regras_enum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class TipoPagamentoEnumTest {

    private TipoPagamentoEnum tipoPagamento;

    @Test
    void deveProcessarRoyaltiesEComissaoAoProcessarLivro() {
        tipoPagamento = TipoPagamentoEnum.LIVRO;
        List<String> processados = tipoPagamento.processarPagamento();
        Assertions.assertIterableEquals(Arrays.asList("ROYALTIES", "COMISSAO"), processados);
    }

    @Test
        //TODO: DEVE FALHAR, teste contra falso positivo
    void deveFalharAoProcessarRoyaltiesEComissaoAoProcessarProdutoFisico() {
        tipoPagamento = TipoPagamentoEnum.PRODUTO_FISICO;
        List<String> processados = tipoPagamento.processarPagamento();
        Assertions.assertIterableEquals(Arrays.asList("ROYALTIES", "COMISSAO"), processados);
    }

    @Test
    void deveProcessarEnvioComissaoParaProdutoFisico() {
        tipoPagamento = TipoPagamentoEnum.PRODUTO_FISICO;
        List<String> processados = tipoPagamento.processarPagamento();
        Assertions.assertIterableEquals(Arrays.asList("ENVIO", "COMISSAO"), processados);
    }

    @Test
    void deveProcessarAssociacaoEmailParaNovaAssociacao() {
        tipoPagamento = TipoPagamentoEnum.NOVA_ASSOCIACAO;
        List<String> processados = tipoPagamento.processarPagamento();
        Assertions.assertIterableEquals(Arrays.asList("ASSOCIACAO", "EMAIL"), processados);
    }

    @Test
    void deveProcessarUpgradeParaUpgrade() {
        tipoPagamento = TipoPagamentoEnum.UPGRADE_ASSOCIACAO;
        List<String> processados = tipoPagamento.processarPagamento();
        Assertions.assertIterableEquals(Arrays.asList("UPGRADE"), processados);
    }

    @Test
    void deveProcessarVideoEVideoRelacionadoParaVideo() {
        tipoPagamento = TipoPagamentoEnum.VIDEO;
        List<String> processados = tipoPagamento.processarPagamento();
        Assertions.assertIterableEquals(Arrays.asList("VIDEO", "VIDEO_RELACIONADO"), processados);
    }

}