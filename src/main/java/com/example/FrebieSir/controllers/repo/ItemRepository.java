package com.example.FrebieSir.controllers.repo;

import com.example.FrebieSir.models.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Long>  {

}
