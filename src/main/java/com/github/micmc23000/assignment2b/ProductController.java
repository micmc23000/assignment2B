/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.micmc23000.assignment2b;

import java.util.List;
import javax.ws.rs.Produces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.github.micmc23000.assignment2b.Product;
import com.github.micmc23000.assignment2b.ProductService;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.validation.Valid;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
/**
 *
 * @author michael
 */

@RestController
@RequestMapping("/Product")
public class ProductController
{

	@RequestMapping(value="/all")
    public ModelAndView getAllProductsModel() {
        List<Product> list = ProductService.getAllProducts();
        return new ModelAndView("/allProducts", "productList", list);
    }
	
 @GetMapping("/add")
    public ModelAndView displayProductAddForm() {
        return new ModelAndView("/addProduct", "Product", new Product());
    }

    @PostMapping("/addProduct")
    public ModelAndView addAProduct(@Valid @ModelAttribute("Product") Product product, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return new ModelAndView("/addProduct");
        }
        ProductService.addAProduct(product);
        return new ModelAndView("redirect:/View");
    }
      
	
	
	@DeleteMapping(value = "/{id}")
	@Produces(MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public int deleteItemById(@PathVariable("id") int id)
	{
	ProductService.get()
		return _repository.deleteItemById(item.getDatabaseEntityId());
	}
    }
