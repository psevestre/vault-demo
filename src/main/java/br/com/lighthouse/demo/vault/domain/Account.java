/**
 * 
 */
package br.com.lighthouse.demo.vault.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

/**
 * @author Philippe
 *
 */
@Table("account")
@Data
public class Account {
	
	@Id
	private long id;
	private String name;
	private long branchId;
	private long customerId;

}
