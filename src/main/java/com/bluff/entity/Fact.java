package com.bluff.entity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.domain.Persistable;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.Objects;

@Document
public class Fact implements Persistable<String> {

    @Id
    private String id;
    private String text;
    private String question;
    private String answer;
    @CreatedDate
    private Date createdDate;
    @LastModifiedDate
    private Date updatedDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    @Override
    public boolean isNew() {
        return id == null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fact fact = (Fact) o;
        return Objects.equals(id, fact.id) &&
                Objects.equals(text, fact.text) &&
                Objects.equals(question, fact.question) &&
                Objects.equals(answer, fact.answer) &&
                Objects.equals(createdDate, fact.createdDate) &&
                Objects.equals(updatedDate, fact.updatedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, text, question, answer, createdDate, updatedDate);
    }

    @Override
    public String toString() {
        return "Fact{" +
                "id='" + id + '\'' +
                ", text='" + text + '\'' +
                ", question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                '}';
    }
}
