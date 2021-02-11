package com.diegoworks2.foodapi2.domain.repository;

import java.util.List;
import com.diegoworks2.foodapi2.domain.model.Restaurante;

public interface RestauranteRepository {
	
	List<Restaurante> listar();
	Restaurante buscar(Long id);
	Restaurante salvar (Restaurante restaurante);
	void remover(Restaurante restaurante);

}
