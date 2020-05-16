package com.sai.controllers;

import java.util.List;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sai.entities.Consumer;
import com.sai.entities.Mobile;


import com.sai.repositories.ConsumerRepository;
import com.sai.repositories.MobileRepository;

@RestController
public class MobileController 
{


	@Autowired
	private MobileRepository mobileRepository;

	@Autowired
	private ConsumerRepository consumerRepository;

	/*
	 * @GetMapping("/posts/{postId}/comments") public Page<Mobile>
	 * getAllCommentsByPostId(@PathVariable (value = "postId") Long postId, Pageable
	 * pageable) { return commentRepository.findByPostId(postId, pageable); }
	 */

	@PostMapping("/mobile/{customerid}/add")
	public Consumer createComment(@PathVariable (value = "customerid") Long id,
			@Valid @RequestBody List<Mobile> mobile)
	{
		Consumer consumer = consumerRepository.findById(id).get();
		mobileRepository.saveAll(mobile);
		consumer.setMobile(mobile);
		return	consumerRepository.save(consumer);

	}


}
