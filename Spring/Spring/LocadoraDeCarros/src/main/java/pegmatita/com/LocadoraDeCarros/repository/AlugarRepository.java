package pegmatita.com.LocadoraDeCarros.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pegmatita.com.LocadoraDeCarros.model.Alugar;

@Repository
public interface AlugarRepository extends JpaRepository<Alugar,Long>{

}