package self.githubArraysTest;

public class ArraysEngine {

    // TODO: метод должен вывести все книги массива, проигнорировать пустые места
    // Книги
    // - <название_книги>: <автор> <кол-во страниц> стр
    public void printAllBooks(Book[] books) {
        System.out.println("Книги");
        for (Book book : books) {
            if (book != null) {
                System.out.println(" - " + book.title + ": " + book.author + book.pages + " стр.");
            }
        }
    }


    // TODO: метод должен посчитать фактическое кол-во книг, не учитывать null
    public int getActualSize(Book[] books) {
        int numberOfBook = 0;

        for (Book book : books) {
            if (book != null) {
                numberOfBook++;
            }
        }

        return numberOfBook;
    }


    // TODO: метод должен посчитать общее количество страниц всех книг массива
    public int countTotalPages(Book[] books) {
        int sumOfPagesOfBooks = 0;

        for (Book book : books) {
            if (book == null) {
                continue;
            } else {
                sumOfPagesOfBooks += book.pages;
            }
        }

        return sumOfPagesOfBooks;
    }


    // TODO: метод должен возвращать объект книги из массива по переданному название
    public Book findBookByTitle(Book[] books, String title) {
        for (Book book : books) {
            if (book.title.equals(title)) {
                return book;
            }
        }
        return null;
    }


    // TODO: метод должен возвращать массив строк, которая состоит только из названия книг
    public String[] getBookTitles(Book[] books) {
        String[] booksTitle = new String[getActualSize(books)];
        int counter = 0;

        for (Book book : books) {
            if (book != null && book.title != null) {
                booksTitle[counter] = book.title;
                counter++;
            }
        }

        return booksTitle;
    }


    // TODO: метод должен находить книгу с самой наибольшей страницей
    public Book findLargestBook(Book[] books) {
        Book largestBook = null;
        int maxPages = Integer.MIN_VALUE;

        for (Book book : books) {
            if (book == null) {
                continue;
            } else {
                if (book.pages > maxPages) {
                    maxPages = book.pages;
                    largestBook = book;
                }
            }
        }

        return largestBook;
    }
}
