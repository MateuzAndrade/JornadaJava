package pegmatita.com.LocadoraDeCarros.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pegmatita.com.LocadoraDeCarros.model.Carro;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Long>{

}
