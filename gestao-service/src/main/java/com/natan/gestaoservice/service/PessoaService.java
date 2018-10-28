package com.natan.gestaoservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.natan.gestaoservice.model.Pessoa;
import com.natan.gestaoservice.model.Response;
import com.natan.gestaoservice.repository.PessoaRepository;

/**
 * @author natancardosodev
 *
 */
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/service")
public class PessoaService {
	
	@Autowired
	private PessoaRepository repository;
	
	@RequestMapping(value="/pessoas", method=RequestMethod.POST, 
			consumes=MediaType.APPLICATION_JSON_UTF8_VALUE, 
			produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody Response salvar(@RequestBody Pessoa pessoa) {
		try {
			this.repository.save(pessoa);
			
			return new Response(1,"Registro salvo com sucesso");
			
		}catch(Exception e){
			return new Response(0,e.getMessage());
		}
	}
	
	@RequestMapping(value="/pessoas", method=RequestMethod.PUT, 
			consumes=MediaType.APPLICATION_JSON_UTF8_VALUE, 
			produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody Response atualizar(@RequestBody Pessoa pessoa) {
		try {
			this.repository.save(pessoa);
			
			return new Response(1,"Registro atualizado com sucesso");
			
		}catch(Exception e){
			return new Response(0,e.getMessage());
		}
	}
	
	@RequestMapping(value="/pessoas", method = RequestMethod.GET, 
			produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody List<Pessoa> consultar(){
		
		return this.repository.findAll();
	}
	
	@RequestMapping(value="/pessoas/{codigo}", method = RequestMethod.GET, 
			produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody Pessoa buscar(@PathVariable("codigo") Integer codigo){
		
		return (Pessoa) this.repository.findById(codigo);
	}
	
	@RequestMapping(value="/pessoas/{codigo}", method = RequestMethod.DELETE, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody Response excluir(@PathVariable("codigo") Integer codigo){
		
		Pessoa pessoaModel = (Pessoa) repository.findById(codigo);
		
		try {
			this.repository.delete(pessoaModel);
			
			return new Response(1, "Registro excluido com sucesso!");
			
		}catch(Exception e) {
			return new Response(0, e.getMessage());
		}
	}

}
