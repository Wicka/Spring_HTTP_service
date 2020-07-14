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
		
		@Column(name = "cargo")
		private String cargo;
		
		
		@Column(name = "salario")
		private int salario;
		
		
		
		/**
		 * @param id
		 * @param nombre
		 * @param cargo
		 * @param salario		
		 */
		
		//CONSTRUCTORES		
		public Empleado() {	
		}
		
		
		//CONSTRUCTOR CON PARAMETROS
		public Empleado(Long id, String nombre, String cargo) {
			this.id = id;
			this.nombre = nombre;
			this.cargo = cargo;
	//		this.salario=calculaSalario() ;		
		}
		
		
		//GETTER Y SETTERS		
				
		public Long getId() {
			return id;
		}	
		public void setId(Long id) {
			this.id = id;
		}

				
		
		public String getNombre() {
			return nombre;
		}		
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}	
		
		
		
		public String getCargo() {
			return cargo;
		}		
		public void setCargo(String cargo) {
			this.cargo = cargo;
		}	
		
		
		
		public int getSalario() {
			return salario;
		}		
		public void setSalario(int salario) {
			this.salario = salario;
		}
		
		
		public void calculaSalario() {
			
			//INTERACTUO CON LA ENUM...PASANDOLE EL VALOR SI NO EXISTE DARA ERROR			
			Cargo cargo = Cargo.valueOf(this.getCargo());
			
			switch (cargo) {
			case Master:
				this.setSalario(3600);
			break;
			case Chief_Officer:
				this.setSalario(2600);						
			break;
			case Second_Officer:
				this.setSalario(2300);						
			break;
			case Boatswain:
				this.setSalario(2000);						
			break;
			case Chief_Engineer:
				this.setSalario(3500);						
			break;
			case Machinist:
				this.setSalario(2000);						
			break;
			case Stewards:
				this.setSalario(1600);						
			break;
			case Undefined:
				this.setSalario(0);						
			break;
			default:
				this.setSalario(0);						
			break;
			}			
			
		}
		
		

		
		@Override
		public String toString() {
			return "Empleado [id=" + id + ", Nombre=" + nombre + ", Cargo=" + cargo + ",Salario=" + salario +"]";
		}
		

}
