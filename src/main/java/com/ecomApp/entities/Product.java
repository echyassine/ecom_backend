package com.ecomApp.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private float price;
    @Column(nullable = false)
    private Byte image;
    @Column(nullable = false)
    private String imageUrl;
    @ManyToOne
    private Category category;
    @OneToMany
    private List<Rating> ratings;
    private float rating;
    @ManyToOne
    private Seller seller;

}
