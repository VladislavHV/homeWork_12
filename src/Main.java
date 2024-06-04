import com.sun.jdi.connect.Connector;

public class Main {
    public static void main(String [] args) {
        /*
        Создайте класс Book, который будет содержать в себе данные о названии,
        авторе и годе публикации книги. Убедитесь, что типы полей класса Book выбраны правильно:
        это String, Author и int
         */

        System.out.println("Задача №1");

        /*
        Создайте класс Author, который содержит в себе данные об имени и фамилии автора.
         */

        System.out.println("Задача №2");

        /*
        Напишите конструкторы для обоих классов, заполняющие все поля.
         */

        System.out.println("Задача №3");

        //Создайте геттеры для всех полей автора и всех полей книги.

        System.out.println("Задача №4");

        //Создайте сеттер для поля «Год публикации» у книги.

        System.out.println("Задача №5");

        /*
        В методе main создайте несколько объектов «Книга» (достаточно двух) и несколько объектов «Автор»
        (достаточно тоже двух) и инициализируйте их. Учтите, что авторы являются обязательными и книги не могут
        создаваться без авторов.Метод main не должен находиться в классах Book и Author.
         */

        System.out.println("Задача №6");

        Author nameAuthor = new Author("Lev", "Tolstoy");
        System.out.println(nameAuthor.getName());
        System.out.println(nameAuthor.getSurname());

        Book publicBook = new Book(nameAuthor, 1988);
        System.out.println(publicBook.getPublicationYear());
        System.out.println(nameAuthor.getName() + " " + nameAuthor.getSurname());

        //В том же методе main измените год публикации одной из книг с помощью сеттера.

        System.out.println("Задача №7");

        publicBook.setPublicationYear(2024);
        System.out.println(publicBook.getPublicationYear());
    }
}