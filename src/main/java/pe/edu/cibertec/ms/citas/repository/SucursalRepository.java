package pe.edu.cibertec.ms.citas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.ms.citas.model.Sucursal;

import java.util.List;

@Repository
public interface SucursalRepository extends JpaRepository<Sucursal, Integer> {

    List<Sucursal> findByEstadoTrue();

    List<Sucursal> findByDepartamento(String departamento);

    List<Sucursal> findByDistrito(String distrito);
}