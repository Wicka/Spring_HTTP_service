package es.http.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import es.http.service.dto.Empleado;



public interface IEmpleadoDAO extends JpaRepository<Empleado, Long>{

}
