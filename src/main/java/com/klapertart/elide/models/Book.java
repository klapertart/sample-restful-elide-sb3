package com.klapertart.elide.models;

import com.yahoo.elide.annotation.Include;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import lombok.Data;


/**
 * @author kurakuraninja
 * @since 17/07/24
 */

@Entity
@Table(name = "book")
@Include(rootLevel = true, name = "book")
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String author;
}
