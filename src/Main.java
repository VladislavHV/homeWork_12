public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        System.out.println("Задача №2");
        System.out.println("Задача №3");
        System.out.println("Задача №4");
        System.out.println("Задача №5");

        System.out.println("Задача №6");
        Author author1 = new Author("Lev", "Tolstoy");
        Author author2 = new Author("Fyodor", "Dostoevsky");

        Book book1 = new Book("War and Peace", author1, 1869);
        Book book2 = new Book("Crime and Punishment", author2, 1866);

        System.out.println(author1.getName());
        System.out.println(author1.getSurname());
        System.out.println(book1.getTitle());
        System.out.println(book1.getAuthor().getName() + " " + book1.getAuthor().getSurname());
        System.out.println(book1.getPublicationYear());

        System.out.println("Задача №7");
        book1.setPublicationYear(2024);
        System.out.println(book1.getPublicationYear());

        System.out.println("Задача №8");
        System.out.println(author1.toString());
        System.out.println(book1.toString());

        System.out.println(book1.equals(book2));
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
    }
}