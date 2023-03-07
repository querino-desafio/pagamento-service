package com.silva.pagamento;

import com.silva.pagamento.regras_enum.TipoPagamento;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class TipoPagamentoTest {

    private TipoPagamento tipoPagamento;

    @Test
    void deveProcessarRoyaltiesEComissaoAoProcessarLivro() {
        tipoPagamento = TipoPagamento.LIVRO;
        List<String> processados = tipoPagamento.processarPagamento();
        Assertions.assertIterableEquals(List.of("ROYALTIES", "COMISSAO"), processados);

    }

    @Test
    void deveProcessarEnvioComissaoParaProdutoFisico() {
        tipoPagamento = TipoPagamento.PRODUTO_FISICO;
        List<String> processados = tipoPagamento.processarPagamento();
        Assertions.assertIterableEquals(List.of("ENVIO", "COMISSAO"), processados, "Lista de processados deveria conter ENVIO, COMISSAO");
        Assertions.assertTrue(processados.containsAll(List.of("ENVIO", "COMISSAO")),"Lista de processados deveria conter ENVIO, COMISSAO");
    }

    @Test
    void deveProcessarAssociacaoEmailParaNovaAssociacao() {
        tipoPagamento = TipoPagamento.NOVA_ASSOCIACAO;
        List<String> processados = tipoPagamento.processarPagamento();
        Assertions.assertIterableEquals(List.of("ASSOCIACAO", "EMAIL"), processados);
    }

    @Test
    void deveProcessarUpgradeParaUpgrade() {
        tipoPagamento = TipoPagamento.UPGRADE_ASSOCIACAO;
        List<String> processados = tipoPagamento.processarPagamento();
        Assertions.assertIterableEquals(List.of("UPGRADE"), processados);
    }

    @Test
    void deveProcessarVideoEVideoRelacionadoParaVideo() {
        tipoPagamento = TipoPagamento.VIDEO;
        List<String> processados = tipoPagamento.processarPagamento();
        Assertions.assertIterableEquals(List.of("VIDEO", "VIDEO_RELACIONADO"), processados);
    }

}