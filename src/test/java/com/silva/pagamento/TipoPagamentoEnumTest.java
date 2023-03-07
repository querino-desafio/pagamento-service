package com.silva.pagamento;

import com.silva.pagamento.regras_enum.TipoPagamentoEnum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class TipoPagamentoEnumTest {

    private TipoPagamentoEnum tipoPagamento;

    @Test
    void deveProcessarRoyaltiesEComissaoAoProcessarLivro() {
        tipoPagamento = TipoPagamentoEnum.LIVRO;
        List<String> processados = tipoPagamento.processarPagamento();
        Assertions.assertIterableEquals(List.of("ROYALTIES", "COMISSAO"), processados);

    }

    @Test
        //TODO: DEVE FALHAR, teste contra falso positivo
    void deveFalharAoProcessarRoyaltiesEComissaoAoProcessarProdutoFisico() {
        tipoPagamento = TipoPagamentoEnum.PRODUTO_FISICO;
        List<String> processados = tipoPagamento.processarPagamento();
        Assertions.assertIterableEquals(List.of("ROYALTIES", "COMISSAO"), processados);
    }

    @Test
    void deveProcessarEnvioComissaoParaProdutoFisico() {
        tipoPagamento = TipoPagamentoEnum.PRODUTO_FISICO;
        List<String> processados = tipoPagamento.processarPagamento();
        Assertions.assertIterableEquals(List.of("ENVIO", "COMISSAO"), processados);
    }

    @Test
    void deveProcessarAssociacaoEmailParaNovaAssociacao() {
        tipoPagamento = TipoPagamentoEnum.NOVA_ASSOCIACAO;
        List<String> processados = tipoPagamento.processarPagamento();
        Assertions.assertIterableEquals(List.of("ASSOCIACAO", "EMAIL"), processados);
    }

    @Test
    void deveProcessarUpgradeParaUpgrade() {
        tipoPagamento = TipoPagamentoEnum.UPGRADE_ASSOCIACAO;
        List<String> processados = tipoPagamento.processarPagamento();
        Assertions.assertIterableEquals(List.of("UPGRADE"), processados);
    }

    @Test
    void deveProcessarVideoEVideoRelacionadoParaVideo() {
        tipoPagamento = TipoPagamentoEnum.VIDEO;
        List<String> processados = tipoPagamento.processarPagamento();
        Assertions.assertIterableEquals(List.of("VIDEO", "VIDEO_RELACIONADO"), processados);
    }

}