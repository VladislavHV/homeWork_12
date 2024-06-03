        /*
        Создайте класс Book, который будет содержать в себе данные о названии,
        авторе и годе публикации книги. Убедитесь, что типы полей класса Book выбраны правильно:
        это String, Author и int
        */

public class Book {
    private String title;
    private String author;
    private int publicationYear;

    public Book (String author, int publicationYear){
        this.author = author;
        this.publicationYear = publicationYear;
    }

    //Напишите конструкторы для обоих классов, заполняющие все поля.

    public void CreationBook (String title, String author, int publicationYear){

    }

    //Создайте геттеры для всех полей автора и всех полей книги.

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getPublicationYear(){
        return publicationYear;
    }

    //Создайте сеттер для поля «Год публикации» у книги.

    public void setPublicationYear (int publicationYear){
        this.publicationYear = publicationYear;
    }
}
