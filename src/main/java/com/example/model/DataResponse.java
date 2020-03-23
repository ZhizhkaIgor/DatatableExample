package com.example.model;

import java.util.Arrays;
import java.util.List;

@lombok.Data
public class DataResponse {

	private List<Data> data = Arrays.asList(Data.of("Igor","test","text","/image/logo.png"),
			 Data.of("Sergey","test_sergey","text_sergey","/image/logo.png"),
			 Data.of("Vova","test_vova","text_vova","/image/logo.png"));
	private String recordsTotal = "10";
	private String recordsFiltered = "100";
}
