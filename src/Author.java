/*
Создайте класс Author, который содержит в себе данные об имени и фамилии автора.
 */
public class Author {
    private String name;
    private String surname;

    public Author (String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    //Создайте геттеры для всех полей автора и всех полей книги.

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }
}
