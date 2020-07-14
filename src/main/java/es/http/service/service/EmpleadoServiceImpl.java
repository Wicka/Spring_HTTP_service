package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.http.service.dao.IEmpleadoDAO;
import es.http.service.dto.Empleado;


@Service
public class EmpleadoServiceImpl implements IEmpleadoService {
	
	// ESCANEA TODAS LAS CLASES EN BUSCA DE LOS METODOS QUE IMPLEMENTA IEmpleadoDAO

		//@org.springframework.beans.factory.annotation.Autowired(required=true)
		
		@Autowired
		IEmpleadoDAO iEmpleadoDAO;

		
		@Override
		public List<Empleado> listarEmpleados() {
			
			return iEmpleadoDAO.findAll();
		}

		@Override
		public Empleado guardarEmpleado(Empleado empleado) {
			return iEmpleadoDAO.save(empleado);
		}

		@Override
		public Empleado empleadoXID(Long id) {
		
			return iEmpleadoDAO.findById(id).get();
		}

		@Override
		public Empleado actualizarEmpleado(Empleado empleado) {
		
			return iEmpleadoDAO.save(empleado);
		}

		@Override
		public void eliminarEmpleado(Long id) {
			iEmpleadoDAO.deleteById(id);
			
		}

		public List<Empleado> mostrarSalarios() {
			return iEmpleadoDAO.findAll();
			
		}
		

}
