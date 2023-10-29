package com.example.lfbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transacoes")
public class TransacaoController {
    @Autowired
    private TransacaoService transacaoService; // Você precisa injetar o serviço correspondente

    @PostMapping("/")
    public Transacao criarTransacao(@RequestBody Transacao transacao) {
        return transacaoService.criarTransacao(transacao); // Chame o método do serviço para criar uma nova transação
    }

    @GetMapping("/")
    public List<Transacao> listarTransacoes() {
        return transacaoService.listarTransacoes(); // Chame o método do serviço para listar as transações
    }

    @GetMapping("/{id}")
    public Transacao obterTransacaoPorId(@PathVariable Long id) {
        return transacaoService.obterTransacaoPorId(id); // Chame o método do serviço para obter uma transação por ID
    }

    @GetMapping("/conta/{idConta}")
    public List<Transacao> listarTransacoesPorConta(@PathVariable Long idConta) {
        return transacaoService.listarTransacoesPorConta(idConta); // Chame o método do serviço para listar as transações por conta
    }
}
