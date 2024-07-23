package com.klapertart.elide.models;

import com.yahoo.elide.annotation.Include;
import com.yahoo.elide.annotation.ReadPermission;
import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "product")
@Include(name = "product")
@ReadPermission(expression = "Prefab.Role.All")  // Allow read access to everyone
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Double price;

    @ManyToOne
    @JoinColumn(name = "category",nullable = false)
    private Category category;
}
