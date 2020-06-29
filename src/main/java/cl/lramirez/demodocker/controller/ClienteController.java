package cl.lramirez.demodocker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.lramirez.demodocker.data.Cliente;
import cl.lramirez.demodocker.service.ClienteService;

@RestController
@RequestMapping("/api")
@EnableAutoConfiguration
public class ClienteController {
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping("/clientes")
	public List<Cliente> findAll(){
		return clienteService.findAll();
	}
	
	@GetMapping("/clientes/{clienteId}")
	public Cliente getCliente(@PathVariable int clienteId){
		Cliente cliente = clienteService.findById(clienteId);
		
		if(cliente == null) {
			throw new RuntimeException("Cliente id not found -"+clienteId);
		}
		return cliente;
	}
	
	
	@PostMapping("/clientes")
	public Cliente addCliente(@RequestBody Cliente cliente) {
		cliente.setId(0);
		clienteService.save(cliente);
		return cliente;
	}

	@PutMapping("/clientes")
	public Cliente updateCliente(@RequestBody Cliente cliente) {
		clienteService.save(cliente);
		return cliente;
	}
	
	@DeleteMapping("clientes/{clienteId}")
	public String deleteCliente(@PathVariable int clienteId) {
		
		Cliente  cliente = clienteService.findById(clienteId);
		
		if(cliente == null) {
			throw new RuntimeException("Cliente id not found -"+clienteId);
		}
		
		clienteService.deleteById(clienteId);
		
		return "Deleted Cliente id - "+clienteId;
	}
	
	@RequestMapping("/version")
    String version() {
        return "LRQ 0.0.1";
    }
}
