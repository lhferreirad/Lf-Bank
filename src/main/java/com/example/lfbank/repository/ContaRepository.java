package com.example.lfbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Long> {
    // Recomendação 1: Consulta personalizada para buscar uma conta por CPF
    Optional<Conta> findByCpf(String cpf);

    // Recomendação 2: Consulta personalizada para buscar uma conta por número de conta
    Optional<Conta> findByNumero(String numero);

    // Recomendação 3: Consulta personalizada para buscar todas as contas de um determinado nome
    List<Conta> findByNome(String nome);

    // Recomendação 4: Consulta personalizada para buscar todas as contas com saldo maior que um valor específico
    List<Conta> findBySaldoGreaterThan(double saldo);

    // Recomendação 5: Consulta personalizada para buscar todas as contas com saldo menor que um valor específico
    List<Conta> findBySaldoLessThan(double saldo);

    // Recomendação 6: Consulta personalizada para buscar todas as contas que foram criadas em uma data específica
    List<Conta> findByDataNascimento(String dataNascimento);
}
