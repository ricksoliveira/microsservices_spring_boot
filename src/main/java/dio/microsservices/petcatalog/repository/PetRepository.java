package dio.microsservices.petcatalog.repository;

import dio.microsservices.petcatalog.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
