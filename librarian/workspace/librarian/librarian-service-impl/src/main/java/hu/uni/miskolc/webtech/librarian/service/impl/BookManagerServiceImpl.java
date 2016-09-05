package hu.uni.miskolc.webtech.librarian.service.impl;

import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;

import hu.uni.miskolc.webtech.librarian.model.Author;
import hu.uni.miskolc.webtech.librarian.model.Book;
import hu.uni.miskolc.webtech.librarian.model.Nationality;
import hu.uni.miskolc.webtech.librarian.model.exceptions.IllegalBirthDateException;
import hu.uni.miskolc.webtech.librarian.model.exceptions.IllegalPersonNameException;
import hu.uni.miskolc.webtech.librarian.persist.AuthorDAO;
import hu.uni.miskolc.webtech.librarian.persist.AuthorNotFoundException;
import hu.uni.miskolc.webtech.librarian.persist.ExistingAuthorException;
import hu.uni.miskolc.webtech.librarian.service.AuthorManipulationException;
import hu.uni.miskolc.webtech.librarian.service.BookManagerService;

public class BookManagerServiceImpl implements BookManagerService {

	private AuthorDAO authorDAO;

	public BookManagerServiceImpl(AuthorDAO authorDAO) {
		this.authorDAO = authorDAO;
	}

	public void addAuthor(Author author) throws AuthorManipulationException {
		try {
			this.authorDAO.createAuthor(author);
		} catch (ExistingAuthorException e) {
			throw new AuthorManipulationException("Author cannot be created!", e);
		}
	}

	public void updateAuthor(Author author) throws AuthorManipulationException {
		try {
			this.authorDAO.updateAuthor(author);
		} catch (AuthorNotFoundException e) {
			throw new AuthorManipulationException("Author cannot be created!", e);
		}
	}

	public Collection<Author> queryAuthors() {
		return authorDAO.readAuthors();
	}

	public void addBook(Book book) {
		// TODO Auto-generated method stub

	}

	public void updateBook(Book book) {
		// TODO Auto-generated method stub

	}

	public Collection<Book> queryBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<Book> queryBooks(Author author) {
		// TODO Auto-generated method stub
		return null;
	}

}