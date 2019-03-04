package com.minmax;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class TestController {
	@GetMapping(value = "/print")
	public String print() {
		return this.getClass().getSimpleName();
	}
}
