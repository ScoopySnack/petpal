package gr.codingfactory.petpal.repository;

import gr.codingfactory.petpal.model.Pet;
import gr.codingfactory.petpal.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PetRepository extends JpaRepository<Pet, Long> {
    List<Pet> findByOwnerId(Long ownerId);
    List<Pet> findByOwner(User owner);

}
