package es.http.service.service;

import java.util.List;

import es.http.service.dto.Empleado;



public interface IEmpleadoService {
	
	//METODO DE LA LOGICA DE LA APLICACION  CRUD
	
		public List<Empleado> listarEmpleados(); 
		
		public Empleado guardarEmpleado(Empleado empleado);	
		
		public Empleado empleadoXID(Long id); 
		
		public Empleado actualizarEmpleado(Empleado empleado); 
		
		public void eliminarEmpleado(Long id);
		

}
