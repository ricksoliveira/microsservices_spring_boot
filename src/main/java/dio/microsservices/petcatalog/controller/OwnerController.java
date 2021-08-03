package dio.microsservices.petcatalog.controller;

import dio.microsservices.petcatalog.model.Owner;
import dio.microsservices.petcatalog.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/owner")
public class OwnerController {

    @Autowired
    private OwnerRepository ownerRepository;

    @PostMapping
    public Owner createOwner(@RequestBody Owner owner){
        return ownerRepository.save(owner);
    }

    @GetMapping("/{id}")
    public Optional<Owner> findOwnerById(@PathVariable Long id) {
        return ownerRepository.findById(id);
    }

    @GetMapping
    public List<Owner> findAllOwners(){
        return (List<Owner>) ownerRepository.findAll();
    }


}
