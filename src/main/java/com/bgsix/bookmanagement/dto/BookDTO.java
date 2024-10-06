package com.bgsix.bookmanagement.dto;

import java.util.Collections;
import java.util.List;

import com.bgsix.bookmanagement.model.Book;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class BookDTO extends Book {
	private List<String> genres;

	public BookDTO(Book book, List<String> genres) {
		super(book.getBookId(), book.getTitle(), book.getLanguage(), book.getAuthor(), book.getRating(), book.getIsbn(),
				book.getBookFormat(), book.getPages(), book.getNumRatings(), book.getLikedPercent(), book.getPrice(),
				book.getCoverImg(), book.getPublicationYear());
		this.genres = genres != null ? genres : Collections.emptyList();
	}
}
