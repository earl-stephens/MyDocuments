package com.example.MyDocuments.model;

import java.time.LocalDate;

public class Document {
	private final String name;
	private final DocumentType type;
	private final String location;
	private final LocalDate created;
	private LocalDate modified;
	
	public Document(String name, DocumentType type, String location) {
		this.name = name;
		this.type = type;
		this.location = location;
		created = LocalDate.now();
		modified = LocalDate.now();
	}

	@Override
	public String toString() {
		return "Document [name=" + name + ", type=" + type + ", location=" + location + ", created=" + created
				+ ", modified=" + modified + "]";
	}

	public LocalDate getModified() {
		return modified;
	}

	public void setModified(LocalDate modified) {
		this.modified = modified;
	}

	public String getName() {
		return name;
	}

	public DocumentType getType() {
		return type;
	}

	public String getLocation() {
		return location;
	}

	public LocalDate getCreated() {
		return created;
	}
}
