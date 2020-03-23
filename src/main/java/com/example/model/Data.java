package com.example.model;

import lombok.AllArgsConstructor;

@lombok.Data
@AllArgsConstructor(staticName="of")
public class Data {
	private String name;
	private String title;
	private String text;
	private String path;
}
