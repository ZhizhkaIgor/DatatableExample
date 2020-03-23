package com.example.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.DataResponse;
import com.example.model.TableRequest;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class MainRestController {

	@GetMapping("/data")
	public ResponseEntity<?> getData(TableRequest tr){
		log.info("Start: [ {} ] \nlenght: [ {} ] \nsearch: [ {} ]", tr.getStart(), tr.getLength(), tr.getSearch().get("value"));
		return new ResponseEntity<>(new DataResponse(), HttpStatus.OK);
	}
}
