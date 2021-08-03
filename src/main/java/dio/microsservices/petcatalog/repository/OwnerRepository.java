package dio.microsservices.petcatalog.repository;

import dio.microsservices.petcatalog.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
