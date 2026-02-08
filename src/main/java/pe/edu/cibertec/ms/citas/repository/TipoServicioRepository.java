package pe.edu.cibertec.ms.citas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.ms.citas.model.TipoServicio;

import java.util.List;

@Repository
public interface TipoServicioRepository extends JpaRepository<TipoServicio, Integer> {

    List<TipoServicio> findByEstadoTrue();
}