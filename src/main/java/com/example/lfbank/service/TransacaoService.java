package com.example.lfbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TransacaoService {
    @Autowired
    private TransacaoRepository transacaoRepository;

    // Método para criar uma nova transação
    public Transacao criarTransacao(Transacao transacao) {
        return transacaoRepository.save(transacao);
    }

    // Método para listar todas as transações
    public List<Transacao> listarTransacoes() {
        return transacaoRepository.findAll();
    }

    // Método para buscar transações por conta de origem
    public List<Transacao> listarTransacoesPorContaOrigem(Long idContaOrigem) {
        return transacaoRepository.findByIdContaOrigem(idContaOrigem);
    }

    // Método para buscar transações por conta de destino
    public List<Transacao> listarTransacoesPorContaDestino(Long idContaDestino) {
        return transacaoRepository.findByIdContaDestino(idContaDestino);
    }
}
