/**
 * 
 */
package br.com.lighthouse.demo.vault.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lighthouse.demo.vault.domain.Account;
import br.com.lighthouse.demo.vault.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

/**
 * @author Philippe
 *
 */
@RestController
@RequiredArgsConstructor
public class AccountController {
	
	private final AccountRepository repo;
	
	@GetMapping("/accounts")
	public Flux<Account> getAccounts() {
		
		return repo.findAll();
		
	}

}
