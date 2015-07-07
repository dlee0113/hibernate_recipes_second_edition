package com.apress.hibernaterecipes.chapter6.recipe3;

import lombok.*;

import javax.persistence.*;

import com.apress.hibernaterecipes.chapter6.recipe2.Book2;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Book3 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Getter
    @Setter
    String title;
    @ElementCollection
    @OrderColumn(columnDefinition = "int", name = "order_column")
    @Column(name = "review")
    List<String> reviews = new ArrayList<>();
}