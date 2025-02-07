class Library implements Cloneable {

    String name;

    List<Book> books;



    Library(String name) {

        this.name = name;

        books = new ArrayList<>();

    }



    void display() {

        System.out.println("Library : " + this.name);

        for (int i = 0; i < books.size(); i++) {

            Book b = books.get(i);

            System.out.println("Book : " + b.title + ", Author : " + b.author);

        }

    }



    void addBook(Book book) { books.add(book); }



    @Override protected Object clone() throws CloneNotSupportedException {

        return super.clone();

    }



   public

    Library shallowClone() {

        try {

            Library clonedLibrary = (Library)this.clone();

            return clonedLibrary;

        } catch (CloneNotSupportedException e) {

            return null;

        }

    }



   public

    Library deepClone() {

        try {

            Library clonedLibrary = (Library)this.clone();

            clonedLibrary.books = new ArrayList<>();

            for (Book book : this.books) {

                clonedLibrary.books.add((Book) book.clone());

            }

            return clonedLibrary;

        } catch (CloneNotSupportedException e) {

            return null;

        }

    }

}

    class Book implements Cloneable {

        String title;

        String author;



       public

        Book(String title, String author) {

            this.title = title;

            this.author = author;

        }



        @Override protected Object clone() throws CloneNotSupportedException {

            return super.clone();

        }

    }
