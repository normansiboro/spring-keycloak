package com.example.angular2product.restcontroller;



import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/products")
public class productRestController {


	@GetMapping(path = "/productsmi")
	@ResponseBody
	public List<String> getProducts() {
		List<String> result = new ArrayList<>();
		result.add("redmi-note");
		result.add("mi-note");
		return result;
	}

}
