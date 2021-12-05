package com.br.CadastroSmartPhones.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.br.CadastroSmartPhones.model.SmartPhone;
import com.br.CadastroSmartPhones.service.SmartPhoneService;

@Controller
@RequestMapping("smartPhone")
public class SmartPhoneController {
		
	@Autowired SmartPhoneService smartPhoneService;

	@GetMapping("/listar")
	public ModelAndView listar(ModelMap model) {
		model.addAttribute("smartphone", smartPhoneService.recuperar());
		return new ModelAndView("/list", model);
	}
	
	@GetMapping("/cadastro")
    public ModelAndView preSalvar(ModelMap model) {
    	model.addAttribute("smartphone", new SmartPhone());    
        return new ModelAndView("/add", model);
    }

	 @PostMapping("/salvar")
	    public String salvar(@ModelAttribute("smartphone") SmartPhone smartPhone, BindingResult result, RedirectAttributes attr) {
	        if (result.hasErrors()) {
	            return "/smartPhone/add";
	        }

	        smartPhoneService.salvar(smartPhone);
	        
	        attr.addFlashAttribute("mensagem", "Smartphone criado com sucesso.");
	        
	        return "redirect:/smartPhone/listar";
	       
	    }
	 
	 @GetMapping("/{id}/remover")
	    public String remover(@PathVariable("id") Long id, RedirectAttributes attr) {
	    	smartPhoneService.excluir(id);
	        attr.addFlashAttribute("mensagem", "Smartphone excluído com sucesso.");
	        return "redirect:/smartPhone/listar";
	    }
}
