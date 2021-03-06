package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import entity.ProductEntity;
import repository.ProductRepository;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	ProductRepository productRepository;
	
    @GetMapping("/teste")
    public String teste(){
        return new String("5 * 10 é: " + 5*10 + " :)");
    }
	
	@PostMapping
	public ProductEntity saveProduct(@RequestBody ProductEntity productEntity) {
		return productRepository.save(productEntity);
	}
	
	@GetMapping("/{id}")
	public ProductEntity getProduct(@PathVariable Long id) {
		return  productRepository.findById(id).orElse(null);
		
	}
	
	@DeleteMapping("/{id}")
	public void deleteProduct(@PathVariable Long id) {
		productRepository.deleteById(id);
	}
	
	@PutMapping("/{id}")
	public ProductEntity updateProduct(@PathVariable Long id, @RequestBody ProductEntity productEntity) { //boolean é tipo primitivo sem método e o Boolean é Wrapper de boolean e ele tem métodos (classe) b!=B
		if(productRepository.existsById(id)) {
			var produto = productRepository.findById(id).get();
		}
		
		return null;
	}

}
