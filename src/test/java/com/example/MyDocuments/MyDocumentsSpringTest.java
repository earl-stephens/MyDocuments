package com.example.MyDocuments;

import static com.example.MyDocuments.model.DocumentType.PDF;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

import com.example.MyDocuments.service.SearchEngine;

@ContextConfiguration(classes= {TestConfiguration.class})
public class MyDocumentsSpringTest {
	
	@Autowired
	SearchEngine engine;
	//SearchEngine engine = new StaticSearchEngine();
	
	@Test
	void testFindByType() {
		var documents = engine.findByType(PDF);
		
		assertNotNull(documents);
		assertEquals(documents.size(), 1);
		assertEquals(PDF.name, documents.get(0).getType().name);
		assertEquals(PDF.desc, documents.get(0).getType().desc);
		assertEquals(PDF.extension, documents.get(0).getType().extension);
	}
	
	@Test
	void testListAll() {
		var documents = engine.listAll();
		
		assertNotNull(documents);
		assertEquals(documents.size(), 4);
	}
}
