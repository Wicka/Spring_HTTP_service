package es.http.service.dto;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


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
		
	//	@Column(name = "salario")
	//	private int salario2;
	
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
//			this.salario2=calculaSalario2() ;		
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
			
			boolean exist=false;
			
			for (Cargo c : Cargo.values()) {
				if (c.name().equals(this.getCargo())) {
					exist=true;
				}			
			}
			
			if (exist==true) {
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
			}else {
				this.setCargo("NO Existe cargo");
				this.setSalario(0);
			}
		}
		
		
		
		
/*		
		
	public int  calculaSalario2() {		
		
			//INTERACTUO CON LA ENUM...PASANDOLE EL VALOR SI NO EXISTE DARA ERROR			
			Cargo cargo = Cargo.valueOf(this.getCargo());
			int nomina;
			
			switch (cargo) {
			case Master:
				nomina=5600;
			break;
			case Chief_Officer:
				nomina =4600;						
			break;
			case Second_Officer:
				nomina =4300;						
			break;
			case Boatswain:
				nomina =4000;						
			break;
			case Chief_Engineer:
				nomina =5500;						
			break;
			case Machinist:
				nomina =4000;						
			break;
			case Stewards:
				nomina =3600;						
			break;
			case Undefined:
				nomina =0;						
			break;
			default:
				nomina =0;						
			break;
			}			
			
			return nomina;
			
		}
		
	*/	

		
		@Override
		public String toString() {
			return "Empleado [id=" + id + ", Nombre=" + nombre + ", Cargo=" + cargo + ",Salario=" + salario +"]";
//			return "Empleado [id=" + id + ", Nombre=" + nombre + ", Cargo=" + cargo + ",Salario=" + salario2 +"]";

		}
		

}
