package com.birzavit.Birzavitec2.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.birzavit.Birzavitec2.entity.Idat;

@RestController
@RequestMapping()
public class IdatController {
    // private static final String template = "ALUMNO, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping()
	public Idat greeting(@RequestParam(value = "name", defaultValue = "A20200702 - BIRZAVIT ALVAREZ PINTO") String name) {
		return new Idat(counter.incrementAndGet(), String.format( name));
	}

	@GetMapping("/codigo")
	public Idat greeting2(@RequestParam(value = "name", defaultValue = "A20200702") String name) {
		return new Idat(counter.incrementAndGet(), String.format( name));
	}

	@GetMapping("/nombre-completo")
	public Idat greeting3(@RequestParam(value = "name", defaultValue = "BIRZAVIT ALVAREZ PINTO") String name) {
		return new Idat(counter.incrementAndGet(), String.format( name));
	}

}
