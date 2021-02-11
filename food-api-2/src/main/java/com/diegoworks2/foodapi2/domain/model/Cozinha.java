/**
 *Use o lombok para reduzir códigos boiler plate nas classes.
OBS: Ao usar o @Data (que inclui um get, set, equals, hash e toString) você pode querer definir o 
equals e o hash para um atributo em específico. Nessa cado coloque na classe a notação abaixo:
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
E acima do atributo ID coloque: @EqualsAndHashCode.Include 
 */

package com.diegoworks2.foodapi2.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Cozinha {
	
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;

}