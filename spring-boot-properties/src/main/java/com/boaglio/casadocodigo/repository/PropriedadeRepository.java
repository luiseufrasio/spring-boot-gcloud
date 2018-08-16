package com.boaglio.casadocodigo.repository;

import org.springframework.data.repository.*;
import org.springframework.data.repository.query.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

import com.boaglio.casadocodigo.model.*;

public interface PropriedadeRepository 
    extends PagingAndSortingRepository<Propriedade, String> {

    @Query("Select c from Propriedade c where c.nome like %:filtro% order by categoria, subcategoria, nome")
    public List<Propriedade> findByFiltro(@Param("filtro") String filtro);

}