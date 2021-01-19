package br.com.wtag.handmade.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Amizades {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name = "usuario_um")
	private Usuarios usuariosUm;
	@ManyToOne
	@JoinColumn(name = "usuario_dois")
	private Usuarios usuariosDois;
	@ManyToOne
	@JoinColumn(name = "pendencia")
	private Pendencias pendencias;
}
