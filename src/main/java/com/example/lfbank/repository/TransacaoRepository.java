package com.example.lfbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransacaoRepository extends JpaRepository<Transacao, Long> {
    // Recomendação 1: Consulta personalizada para buscar todas as transações de uma conta de origem específica
    List<Transacao> findByContaOrigem(Conta contaOrigem);

    // Recomendação 2: Consulta personalizada para buscar todas as transações de uma conta de destino específica
    List<Transacao> findByContaDestino(Conta contaDestino);

    // Recomendação 3: Consulta personalizada para buscar todas as transações de um determinado tipo (por exemplo, "saque" ou "depósito")
    List<Transacao> findByTipo(String tipo);

    // Recomendação 4: Consulta personalizada para buscar todas as transações de um determinado período de tempo
    List<Transacao> findByDataHoraBetween(String dataHoraInicial, String dataHoraFinal);

    // Recomendação 5: Consulta personalizada para buscar todas as transações com valor maior que um valor específico
    List<Transacao> findByValorGreaterThan(double valor);

    // Recomendação 6: Consulta personalizada para buscar todas as transações com valor menor que um valor específico
    List<Transacao> findByValorLessThan(double valor);
}
