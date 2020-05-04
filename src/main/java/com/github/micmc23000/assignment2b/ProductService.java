/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.micmc23000.assignment2b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.github.micmc23000.assignment2b.Product;//you may have to change this import depending on where you store the Product class
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author michael
 */

@Service
public class ProductService {
 @Autowired
    ProductService productService;
		 
    static List<Product> productList = new ArrayList();

    static {
        productList.add(new Product("XG809", "Contemporary Office Desk", "Concentrating on the job is a lot easier when everyone has a place that’s comfortable to work at.", 25.00, 69.00, 18));
        productList.add(new Product("BG565", "Bed Frame With Storage", "With the comfort and quality you get from our sturdy single beds, you’ll wake up refreshed and ready to roll. ", 139.00, 175.00, 5));
        productList.add(new Product("PO262", "TV Stand", "Our TV stands and TV cabinets are there to cut the clutter and get things organised.", 69.99, 89.99, 120));
        productList.add(new Product("MC342", "Kitchen Unit", "They make the most of your wall by giving you extra storage, and the right kitchen shelf can boost the style of your decor too", 23.00, 65.99, 89));
        productList.add(new Product("WS341", "Folding Chair", "You can fold the chair, so it takes less space when you're not using it.", 12.00, 35.99, 30));
        productList.add(new Product("TF875", "Berkant Kitchen", "Express yourself in the place where all of life’s daily activities take place.in our stylish, yet personalised kitchen..", 8900.00, 12200.99, 4));

    }

    public static List<Product> getAllProducts() {
        return productList;
    }// end getAllProducts

    
    public boolean addAProduct(Product p) {
      
		return productList.add(p);
    }
    
    public void deleteAProduct(String code) {
        
        Iterator<Product> iterator = productList.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getCode().equalsIgnoreCase(code)) {
                iterator.remove();
            }
        }
    }//end deleteAProduct

}//end class ProductService