package com.example.model;

import java.util.Map;

@lombok.Data
public class TableRequest {
	private String start;
	private String length;
	private Map<String, String> search;
	
}
