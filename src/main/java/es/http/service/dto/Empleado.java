package es.http.service.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="empleados")

public class Empleado {
	
		//CAMPOS TABLA EMPLEADOS EN MI BASE DE DATOS H2 EMBEBIDA
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
		private Long id;
		
		@Column(name = "nombre")//no hace falta si se llama igual
		private String nombre;
		
		@Column(name = "feina")//no hace falta si se llama igual
		private String feina;
		
		
		//CONSTRUCTOR
		
		public Empleado() {
		
		}
		
		
		/**
		 * @param id
		 * @param nombre
		 * @param feina		
		 */
		

		public Empleado(Long id, String nombre, String feina) {
			this.id = id;
			this.nombre = nombre;
			this.feina = feina;
		}
		
		//GETTER Y SETTERS
		

		// CAMPO ID
		
		/**
		 * @return the id
		 */
		public Long getId() {
			return id;
		}

		/**
		 * @param id the id to set
		 */
		public void setId(Long id) {
			this.id = id;
		}

		//CAMPO NOMBRE
		
		/**
		 * @return the nombre
		 */
		public String getNombre() {
			return nombre;
		}

		/**
		 * @param nombre the nombre to set
		 */
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		//CAMPO FEINA

		/**
		 * @return the feina
		 */
		public String getFeina() {
			return feina;
		}

		/**
		 * @param feina the feina to set
		 */
		public void setFeina(String feina) {
			this.feina = feina;
		}
		
		//IMPRIMIR EN CONSOLA

		//Metodo impresion de datos por consola
		
		@Override
		public String toString() {
			return "Cliente [id=" + id + ", nombre=" + nombre + ", feina=" + feina + "]";
		}
		

}
