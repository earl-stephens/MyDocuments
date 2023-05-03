package com.example.MyDocuments;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static com.example.MyDocuments.model.DocumentType.*;


import org.junit.jupiter.api.Test;

import com.example.MyDocuments.service.SearchEngine;
import com.example.MyDocuments.model.DocumentType;

public class MyDocumentsTest {

	SearchEngine engine = new StaticSearchEngine();
	
	@Test
	void testFindByName() {
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
