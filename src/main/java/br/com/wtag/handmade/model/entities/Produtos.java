package br.com.wtag.handmade.model.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Produtos {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@NotNull
	@NotEmpty
	@Size(min = 1, max = 160)
	private String produto;
	@NotEmpty
	@Size(min = 1, max = 40)
	private String foto;
	@NotNull
	private String descricao;
	private Double preco;
	@Column(name = "data_cadastro")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime dataCadastro;
	@ManyToOne
	@JoinColumn(name = "usuario")
	private Usuarios usuarios;
		
}