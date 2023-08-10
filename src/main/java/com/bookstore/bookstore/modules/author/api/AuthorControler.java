package com.bookstore.bookstore.modules.author.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.bookstore.common.enums.Uri;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@RestController
public class AuthorControler {

	@Operation(summary = "Get detail author.", description = "Get detail author.")
	@SecurityRequirement(name = "Bearer Authentication")
	@GetMapping(value = Uri.AUTHOR_DETAIL)
	public ResponseEntity<?> detail(Long id) {
		return ResponseEntity.ok("ID:" + id);
	}
}
