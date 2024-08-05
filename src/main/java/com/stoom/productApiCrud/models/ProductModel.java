package com.stoom.productApiCrud.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name = "TB_PRODUCTS")
public class ProductModel implements Serializable {
}
