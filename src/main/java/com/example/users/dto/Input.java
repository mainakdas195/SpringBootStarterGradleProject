package com.example.users.dto;

import java.util.List;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "book" })
@Generated("jsonschema2pojo")
public class Input {

	@JsonProperty("book")
	@Valid
    @NotNull(message="Data is mandatory")
	private List<Book> book = null;

	@JsonProperty("book")
	public List<Book> getBook() {
		return book;
	}

	@JsonProperty("book")
	public void setBook(List<Book> book) {
		this.book = book;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(Input.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
				.append('[');
		sb.append("book");
		sb.append('=');
		sb.append(((this.book == null) ? "<null>" : this.book));
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
		result = ((result * 31) + ((this.book == null) ? 0 : this.book.hashCode()));
		return result;
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Input) == false) {
			return false;
		}
		Input rhs = ((Input) other);
		return ((this.book == rhs.book) || ((this.book != null) && this.book.equals(rhs.book)));
	}

}