package com.example.MyDocuments.service;

import java.util.List;

import com.example.MyDocuments.model.Document;
import com.example.MyDocuments.model.DocumentType;

public interface SearchEngine {
	List<Document> findByType(DocumentType documentType);
	
	List<Document> listAll();
}
