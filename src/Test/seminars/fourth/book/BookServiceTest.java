package seminars.fourth.book;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class BookServiceTest {

    private BookRepository bookRepository;
    private BookService bookService;

    @BeforeEach
    void setUp() {
        bookRepository = mock(InMemoryBookRepository.class);
        bookService = new BookService(bookRepository);
    }

    @Test
    void  testFindBookById() {

        String id = "1";
        Book expectedBook = new Book("1", "Book1", "Author1");
        when(bookRepository.findById(id)).thenReturn(expectedBook);

        Book actualBook = bookService.findBookById(id);

        verify(bookRepository).findById(id);
        assertEquals(expectedBook, actualBook);
    }

    @Test
    public void testFindAllBooks() {

        List<Book> expectedBooks = new ArrayList<>();
        expectedBooks.add(new Book("1", "Book1", "Author1"));
        expectedBooks.add(new Book("2", "Book2", "Author2"));
        when(bookRepository.findAll()).thenReturn(expectedBooks);

        List<Book> actualBooks = bookService.findAllBooks();

        verify(bookRepository).findAll();
        assertEquals(expectedBooks, actualBooks);
    }
}