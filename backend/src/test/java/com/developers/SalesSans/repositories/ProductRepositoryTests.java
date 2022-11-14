package com.developers.SalesSans.repositories;

import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.dao.EmptyResultDataAccessException;

import com.developers.SalesSans.entities.Produto;
import com.developers.SalesSans.tests.Factory;

@DataJpaTest
public class ProdutoRepositoryTests {

	@Autowired
	private ProductRepository repository;
	
	private long existingId;
	private long nonExistingId;
	private long countTotalProducts;
	
	@BeforeEach
	void setUp() throws Exception {
		existingId = 1L;
		nonExistingId = 1000L;
		countTotalProducts = 25L;
	}
	
	//teste ok
	
	@Test
	public void saveShouldPersistWithAutoincrementWhenIdIsNull() {

		Produto produto = Factory.createProduct();
		produto.setId(null);
		
		produto = repository.save(produto);
		Optional<Produto> result = repository.findById(produto.getId());
		
		Assertions.assertNotNull(produto.getId());
		Assertions.assertEquals(countTotalProducts + 1L, produto.getId());
		Assertions.assertTrue(result.isPresent());
		Assertions.assertSame(result.get(), produto);
	}
	
	@Test
	public void deleteShouldDeleteObjectWhenIdExists() {
		
		repository.deleteById(existingId);

		Optional<Produto> result = repository.findById(existingId);
		
		Assertions.assertFalse(result.isPresent());
	}
	
	@Test
	public void deleteShouldThrowEmptyResultDataAccessExceptionWhenIdDoesNotExist() {

		Assertions.assertThrows(EmptyResultDataAccessException.class, () -> {
			repository.deleteById(nonExistingId);			
		});
	}
}
