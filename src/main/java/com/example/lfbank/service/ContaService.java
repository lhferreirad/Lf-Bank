package com.example.lfbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ContaService {
    @Autowired
    private ContaRepository contaRepository;

    // Método para criar uma nova conta
    public Conta criarConta(Conta conta) {
        return contaRepository.save(conta);
    }

    // Método para atualizar os detalhes de uma conta
    public Conta atualizarConta(Conta conta) {
        return contaRepository.save(conta);
    }

    // Método para listar todas as contas
    public List<Conta> listarContas() {
        return contaRepository.findAll();
    }

    // Método para obter o saldo de uma conta
    public double obterSaldo(Long id) {
        Optional<Conta> optionalConta = contaRepository.findById(id);
        if (optionalConta.isPresent()) {
            return optionalConta.get().getSaldo();
        }
        return 0.0; // Retorna 0 se a conta não for encontrada
    }

    // Método para excluir uma conta
    public void excluirConta(Long id) {
        contaRepository.deleteById(id);
    }

    // Método para buscar uma conta por ID
    public Optional<Conta> encontrarContaPorId(Long id) {
        return contaRepository.findById(id);
    }
}

