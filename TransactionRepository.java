package onlinebanking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import onlinebanking.entity.Transaction;

public interface TransactionRepository
        extends JpaRepository<Transaction, Long> {

    List<Transaction> findByAccountNumberOrderByDateDesc(String accountNumber);
}