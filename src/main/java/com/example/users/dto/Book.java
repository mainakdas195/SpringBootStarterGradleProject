package com.example.users.dto;

import javax.annotation.Generated;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "author", "title", "genre", "price", "description", "id" })
@Generated("jsonschema2pojo")
public class Book {

	@JsonProperty("author")
	 @NotBlank(message = "author is mandatory")
	private String author;
	
	@JsonProperty("title")
	@NotBlank(message = "title is mandatory")
	private String title;
	
	@JsonProperty("genre")
	@NotBlank(message = "genre is mandatory")
	private String genre;
	
	@JsonProperty("price")
	@DecimalMax("30.00")
	private Double price;
	
	@JsonProperty("description")
	@NotBlank(message = "description is mandatory")
	private String description;
	
	@JsonProperty("id")
	@NotBlank(message = "description is mandatory")
	private String id;

	@JsonProperty("author")
	public String getAuthor() {
		return author;
	}

	@JsonProperty("author")
	public void setAuthor(String author) {
		this.author = author;
	}

	@JsonProperty("title")
	public String getTitle() {
		return title;
	}

	@JsonProperty("title")
	public void setTitle(String title) {
		this.title = title;
	}

	@JsonProperty("genre")
	public String getGenre() {
		return genre;
	}

	@JsonProperty("genre")
	public void setGenre(String genre) {
		this.genre = genre;
	}

	@JsonProperty("price")
	public Double getPrice() {
		return price;
	}

	@JsonProperty("price")
	public void setPrice(Double price) {
		this.price = price;
	}

	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
	}

	@JsonProperty("id")
	public String getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(Book.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
				.append('[');
		sb.append("author");
		sb.append('=');
		sb.append(((this.author == null) ? "<null>" : this.author));
		sb.append(',');
		sb.append("title");
		sb.append('=');
		sb.append(((this.title == null) ? "<null>" : this.title));
		sb.append(',');
		sb.append("genre");
		sb.append('=');
		sb.append(((this.genre == null) ? "<null>" : this.genre));
		sb.append(',');
		sb.append("price");
		sb.append('=');
		sb.append(((this.price == null) ? "<null>" : this.price));
		sb.append(',');
		sb.append("description");
		sb.append('=');
		sb.append(((this.description == null) ? "<null>" : this.description));
		sb.append(',');
		sb.append("id");
		sb.append('=');
		sb.append(((this.id == null) ? "<null>" : this.id));
		sb.append(',');
		if (sb.charAt((sb.length() - 1)) == ',') {
			sb.setCharAt((sb.length() - 1), ']');
		} else {
			sb.append(']');
		}
		return sb.toString();
	}

	@Override
	public int hashCode() {
		int result = 1;
		result = ((result * 31) + ((this.author == null) ? 0 : this.author.hashCode()));
		result = ((result * 31) + ((this.price == null) ? 0 : this.price.hashCode()));
		result = ((result * 31) + ((this.genre == null) ? 0 : this.genre.hashCode()));
		result = ((result * 31) + ((this.description == null) ? 0 : this.description.hashCode()));
		result = ((result * 31) + ((this.id == null) ? 0 : this.id.hashCode()));
		result = ((result * 31) + ((this.title == null) ? 0 : this.title.hashCode()));
		return result;
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Book) == false) {
			return false;
		}
		Book rhs = ((Book) other);
		return (((((((this.author == rhs.author) || ((this.author != null) && this.author.equals(rhs.author)))
				&& ((this.price == rhs.price) || ((this.price != null) && this.price.equals(rhs.price))))
				&& ((this.genre == rhs.genre) || ((this.genre != null) && this.genre.equals(rhs.genre))))
				&& ((this.description == rhs.description)
						|| ((this.description != null) && this.description.equals(rhs.description))))
				&& ((this.id == rhs.id) || ((this.id != null) && this.id.equals(rhs.id))))
				&& ((this.title == rhs.title) || ((this.title != null) && this.title.equals(rhs.title))));
	}

}