package br.com.wtag.handmade.handmade.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Usuarios {
		
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;		
	@NotNull
	@NotEmpty
	@Size(min = 1, max = 160)
	private String usuario;		
	@NotNull
	@NotEmpty
	@Email
	@Size(min = 1, max = 160)
	private String email;		
	@NotNull
	@NotEmpty
	@Size(min = 1, max = 40)
	private String senha;		
	@NotEmpty
	@Size(min = 1, max = 40)
	private String foto;
		
}