package com.example.mspedido.feign;

import com.example.mspedido.dto.ProductDto;
<<<<<<< HEAD
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
=======
>>>>>>> 2babafd24013e70a61e6ca664d6ec673e8cdf180
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@FeignClient(name = "ms-catalogo-service", path = "/product")
public interface ProductFeign {
    @GetMapping("/{id}")
<<<<<<< HEAD
    @CircuitBreaker(name = "productListByIdCB", fallbackMethod = "productListById")
    public ResponseEntity<ProductDto> getById(@PathVariable Integer id);
    default ResponseEntity<ProductDto> productListById(Integer id, Exception e) {
        return ResponseEntity.ok(new ProductDto());
    }

=======
    public ResponseEntity<ProductDto> getById(@PathVariable Integer id);
>>>>>>> 2babafd24013e70a61e6ca664d6ec673e8cdf180
}
