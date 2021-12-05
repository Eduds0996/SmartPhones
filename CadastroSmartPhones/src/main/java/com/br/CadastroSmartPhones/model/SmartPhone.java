package com.br.CadastroSmartPhones.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity(name = "smartphone")
@Getter
@Setter @ToString 
@Table(name="smartphone")
public class SmartPhone {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, length = 70)
	private String modelo;
	
	@Column(nullable = false, length = 70)
	private double memoria;
	
	@Column(nullable = false, length = 70)
	private String marca;
	
	@Column(nullable = false, length = 70)
	private double preco;

}
