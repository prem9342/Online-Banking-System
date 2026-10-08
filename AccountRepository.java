package onlinebanking.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import onlinebanking.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

    Optional<Account> findByEmail(String email);

    Optional<Account> findByAccountNumber(String accountNumber);
}