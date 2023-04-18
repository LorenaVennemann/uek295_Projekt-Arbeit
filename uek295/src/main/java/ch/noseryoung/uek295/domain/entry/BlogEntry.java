package ch.noseryoung.uek295.domain.entry;

import javax.persistence.*;
import java.util.Date;


@Entity
public class BlogEntry {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String text;

  @ManyToOne(fetch = FetchType.EAGER)
  private Author author;
  private Date date;

  public BlogEntry() {}

  public BlogEntry(String text, Author author) {
    this.text = text;
    this.author = author;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Author getAuthor() {
    return author;
  }

  public void setAuthor(Author author) {
    this.author = author;
  }

  public Object getDate() {
    return date;
  }

  public void setDate(Object date) {
    this.date = (Date) date;
  }
}