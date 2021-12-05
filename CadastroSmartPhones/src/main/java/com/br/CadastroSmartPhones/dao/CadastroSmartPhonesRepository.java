package com.br.CadastroSmartPhones.dao;

import java.util.List;

import com.br.CadastroSmartPhones.model.SmartPhone;

public interface CadastroSmartPhonesRepository {

	void salvar(SmartPhone smartPhone);
	List<SmartPhone> recuperar();
	void excluir (Long id);

}
