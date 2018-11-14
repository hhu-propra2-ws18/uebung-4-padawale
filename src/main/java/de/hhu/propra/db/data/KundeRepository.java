package de.hhu.propra.db.data;

import de.hhu.propra.db.entities.Kunde;
import org.springframework.data.repository.CrudRepository;

public interface KundeRepository extends CrudRepository<Kunde, Long> {

}
