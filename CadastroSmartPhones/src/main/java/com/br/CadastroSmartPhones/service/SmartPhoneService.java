package com.br.CadastroSmartPhones.service;

import java.util.List;

import com.br.CadastroSmartPhones.model.SmartPhone;

public interface SmartPhoneService {
	void salvar(SmartPhone smartPhone);
	List<SmartPhone> recuperar();
	void excluir(Long id);	
}
