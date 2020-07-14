package es.http.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import es.http.service.dto.Empleado;
import es.http.service.service.EmpleadoServiceImpl;

@RestController
@RequestMapping("/api")
public class EmpleadoController {
	
	@Autowired
	EmpleadoServiceImpl empleadoServiceImpl;
	
	//VISUALIAR LISTA EMPLEADOS
	//METODO GET PORQUE SOLO PIDO DATOS	
	@GetMapping("/empleados")
	public List<Empleado> listarEmpleados(){
		return empleadoServiceImpl.listarEmpleados();
	}
	
		
	//BUSCAR Y MOSTRAR UN CLIENTE
	//METODO GET PORQUE PIDO DATOS Y VISUALIZO		
	@GetMapping("/empleados/{id}")
	public Empleado empleadoXID(@PathVariable(name="id") Long id) {
			//PATHVARIABLE PORQUE ........................
			Empleado empleado_xid= new Empleado();
			empleado_xid = empleadoServiceImpl.empleadoXID(id);
			System.out.println("Empleado XID: "+ empleado_xid);
			return empleado_xid;
	}
	
	
	//CREAR UN NUEVO EMPLEADO
	//METODO POST PORQUE ENVIARE DATOS A GUARDAR	
	@PostMapping("/empleados")
	public Empleado salvarEmpleado(@RequestBody Empleado empleado) {
	//REQUESTBODY PORQUE...............	
	
			empleado.calculaSalario();
	
		return empleadoServiceImpl.guardarEmpleado(empleado);
	}
	
	
	//BUSCAR EMPLEADO POR SU ID
	//ACTUALIZARLO EN TABLA
	//USAMOS PUT PORQUE MODIFICAMOS DATOS
	@PutMapping("/empleados/{id}")		
	public Empleado actualizarEmpleado(@PathVariable(name="id")Long id,@RequestBody Empleado empleado) {
		Empleado empleado_seleccionado= new Empleado();
		Empleado empleado_actualizado= new Empleado();			
		empleado_seleccionado= empleadoServiceImpl.empleadoXID(id);
		empleado_seleccionado.setNombre(empleado.getNombre());
		empleado_seleccionado.setCargo(empleado.getCargo());
		empleado_actualizado = empleadoServiceImpl.actualizarEmpleado(empleado_seleccionado);
		System.out.println("El Empleado actualizado es: "+ empleado_actualizado);
		return empleado_actualizado;
	}
	
	//BUSCO REGISTRO
	//ELIMINO REGISTRO	
	@DeleteMapping("/empleados/{id}")	
	public void eliminarEmpleado(@PathVariable(name="id")Long id) {
		empleadoServiceImpl.eliminarEmpleado(id);
	}
	
	//LISTAR TODOS LOS EMPLEADOS Y SUS SALARIOS	
	 @GetMapping("/salarios")	 
	 public List<Empleado> salary(){	     
		 return empleadoServiceImpl.mostrarSalarios();
	 }

}
