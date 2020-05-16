package com.sai.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.sai.entities.Mobile;
import com.sai.repositories.MobileRepository;

@RestController
public class MobileController 
{


	@Autowired
	private MobileRepository mobileRepository;

	/*
	 * @GetMapping("/posts/{postId}/comments") public Page<Mobile>
	 * getAllCommentsByPostId(@PathVariable (value = "postId") Long postId, Pageable
	 * pageable) { return commentRepository.findByPostId(postId, pageable); }
	 */

	/*
	 * @PostMapping("/posts/{id}/comments") public Consumer
	 * createComment(@PathVariable (value = "id") Long id,
	 * 
	 * @Valid @RequestBody List<Mobile> mobile) { Consumer consumer =
	 * consumerRepository.findById(id).get(); mobileRepository.saveAll(mobile);
	 * consumer.setMobile(mobile); return consumerRepository.save(consumer);
	 * 
	 * }
	 */

	@PostMapping("/posts/{id}/comments")
	public Consumer createComment(@PathVariable (value = "id") Long id,
			@Valid @RequestBody List<Mobile> mobile)
	{
		
		Consumer consumer = consumerRepository.findById(id).get();
		mobileRepository.saveAll(mobile);
		consumer.setMobile(mobile);
		return	consumerRepository.save(consumer);

	}
	

	
	

}
