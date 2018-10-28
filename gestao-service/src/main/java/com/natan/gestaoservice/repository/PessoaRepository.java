/**
 * 
 */
package com.natan.gestaoservice.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.natan.gestaoservice.model.Pessoa;

/**
 * @author natancardosodev
 *
 */
public interface PessoaRepository extends Repository<Pessoa, Long> {
	
	void save(Pessoa pessoa);
	
	void delete(Pessoa pessoa);
	
	List<Pessoa> findAll();

	Pessoa findById(Integer codigo);

}
