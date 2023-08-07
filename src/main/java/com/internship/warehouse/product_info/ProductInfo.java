package com.internship.warehouse.product_info;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "product_availability")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private float quantity;
}
