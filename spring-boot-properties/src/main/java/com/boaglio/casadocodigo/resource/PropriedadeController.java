package com.boaglio.casadocodigo.resource;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

import com.boaglio.casadocodigo.model.*;
import com.boaglio.casadocodigo.repository.*;

@RestController
@RequestMapping("/api")
public class PropriedadeController {

	@Autowired
	private PropriedadeRepository repository;

	@RequestMapping(value="/find/{filtro}", method=RequestMethod.GET)
	List<Propriedade> findByFiltro(@PathVariable("filtro") String filtro) {
		return repository.findByFiltro(filtro);
	}

}
