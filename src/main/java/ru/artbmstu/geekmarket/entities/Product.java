package ru.artbmstu.geekmarket.entities;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Null;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "product")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "pn")
    private String pn;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "manufacturer_id")
    private Manufacturer manufacturer;

    @Column(name = "image")
    private String image;

    @Column(name = "price")
    private BigDecimal price;

    @Null
    @Column(name = "weight")
    private BigDecimal weight;

    @Null
    @Column(name = "length")
    private BigDecimal length;

    @Null
    @Column(name = "width")
    private BigDecimal width;

    @Null
    @Column(name = "height")
    private BigDecimal height;

    @Null
    @Column(name = "status")
    private Boolean status;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "product")
    private ProductDescription productDescription;

    @OneToMany(mappedBy = "product")
    private List<ProductImage> productImages;
}