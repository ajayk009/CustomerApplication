
package com.sai.repositories;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sai.entities.Mobile;

@Repository
public interface MobileRepository extends JpaRepository<Mobile, Long> {

	// Page<Mobile> findByPostId(Long id, Pageable pageable); //Optional<Mobile>
	//findByIdAndPostId(Long id, Long postId);
}
