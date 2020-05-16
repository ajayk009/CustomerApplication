package com.sai.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sai.entities.Consumer;


@Repository
public interface ConsumerRepository extends JpaRepository<Consumer,Long>{





  
}
