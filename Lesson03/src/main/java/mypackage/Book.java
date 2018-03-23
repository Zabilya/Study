package mypackage;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.time.LocalDate;

/**
 * @author Kirill Nigmatullin
 */
public class Book {
    String author;
    int price;
    LocalDate releaseDate;
    long serialNum;
    int rating;

    public Book(String author, int price, LocalDate releaseDate, long serialNum, int rating) {
        this.author = author;
        this.price = price;
        this.releaseDate = releaseDate;
        this.serialNum = serialNum;
        this.rating = rating;
    }

    public static void main(String[] args) {
        Book dostoevsky = new Book("Dostoevsky", 99, LocalDate.now().minusDays(1), 5555555599999L, 2);
        Book pushkin = new Book("Pushkin", 1000, LocalDate.now(), 1234567890L, 3);

        System.out.println(pushkin.toString());
        System.out.println(dostoevsky.toString());


    }

    @Override
    public String toString() {
        // выводит немного лишней информации перед строкой
        //return ToStringBuilder.reflectionToString(this);

        // выводит без лишней информации
        //return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);

        // как и стандартный вариант
        //return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);

        // минималистичный вариант -- только значения полей
        // return ToStringBuilder.reflectionToString(this, ToStringStyle.SIMPLE_STYLE);

        // каждое поле с новой строки
        //return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);

        // как и первый вариант, но без названия полей
        return ToStringBuilder.reflectionToString(this, ToStringStyle.NO_FIELD_NAMES_STYLE);
    }
}
