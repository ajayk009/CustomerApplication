package com.sai.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sai.entities.Consumer;
import com.sai.entities.Mobile;
import com.sai.exception.ResourceNotFoundException;
import com.sai.repositories.ConsumerRepository;
import com.sai.repositories.MobileRepository;

@RestController
public class ConsumerController {

	@Autowired
	ConsumerRepository consumerRepository;

	
	@Autowired
	private MobileRepository mobileRepository;
	
	

	@PostMapping("/customers")
	public Consumer createPost(@Valid @RequestBody Consumer consumer) {
		return consumerRepository.save(consumer);
	}


	/*
	 * @PutMapping("/posts/{id}") public Consumer updatePost(@PathVariable Long
	 * id, @Valid @RequestBody Consumer postRequest) { return
	 * consumerRepository.findById(id).map(post -> {
	 * post.setFirstName(postRequest.getFirstName());
	 * post.setLastName(postRequest.getLastName());
	 * post.setMiddleName(postRequest.getLastName());
	 * post.setAge(postRequest.getAge()); return consumerRepository.save(post);
	 * }).orElseThrow(() -> new ResourceNotFoundException("id " + id +
	 * " not found")); }
	 */


	/*
	 * @DeleteMapping("/posts/{postId}") public ResponseEntity<?>
	 * deletePost(@PathVariable Long postId) { return
	 * postRepository.findById(postId).map(post -> { postRepository.delete(post);
	 * return ResponseEntity.ok().build(); }).orElseThrow(() -> new
	 * ResourceNotFoundException("PostId " + postId + " not found")); }
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



}
