package com.example.lfbank.controller;

import com.example.lfbank.model.Conta;
import com.example.lfbank.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/contas")
public class ContaController {
    @Autowired
    private ContaService contaService; // Você precisa injetar o serviço correspondente

    @GetMapping("/")
    public List<Conta> listarContas() {
        return contaService.listarContas();
    }

    @PostMapping("/")
    public Conta criarConta(@RequestBody Conta conta) {
        return contaService.criarConta(conta);
    }

    @PutMapping("/{id}")
    public Conta atualizarConta(@PathVariable Long id, @RequestBody Conta conta) {
        // Implemente o método no serviço para atualizar a conta com o ID especificado
        return contaService.atualizarConta(id, conta);
    }

    @DeleteMapping("/{id}")
    public void excluirConta(@PathVariable Long id) {
        // Implemente o método no serviço para excluir a conta com o ID especificado
        contaService.excluirConta(id);
    }

    @GetMapping("/{id}/saldo")
    public double obterSaldo(@PathVariable Long id) {
        // Implemente o método no serviço para obter o saldo da conta com o ID especificado
        return contaService.obterSaldo(id);
    }
}
