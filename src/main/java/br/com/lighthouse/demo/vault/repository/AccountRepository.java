package br.com.lighthouse.demo.vault.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import br.com.lighthouse.demo.vault.domain.Account;

@Repository
public interface AccountRepository extends ReactiveCrudRepository<Account, Long>{

}
