package hello;

import org.springframework.data.repository.CrudRepository;

import hello.User;

//This will be AUTO IMPLEMENTED by Spring into a bean called userRepository
//CRUD refers to Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Integer> {

}
