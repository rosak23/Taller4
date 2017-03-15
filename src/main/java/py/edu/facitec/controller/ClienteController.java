package py.edu.facitec.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import py.edu.facitec.ejemplo2017.dao.ClienteDao;
import py.edu.facitec.ejemplo2017.model.Cliente;

@Controller
@Transactional
public class ClienteController {
	
	
	@Autowired //Crea una instancia del objeto para toda la aplicacin. Tambien se le dice Inyeccion de  clase
	private ClienteDao dao;
	
	@RequestMapping("/cliente")  //convierte lo resivido por la url en objeto Java cliente
	public String registrar(Cliente cliente){
		
		dao.save(cliente);
		
		return "/view/cliente/ok";
	}
	
}
