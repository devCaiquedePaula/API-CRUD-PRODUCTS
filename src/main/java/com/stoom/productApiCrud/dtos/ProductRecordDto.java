package com.stoom.productApiCrud.dtos;

import com.stoom.productApiCrud.models.Categoria;
import com.stoom.productApiCrud.models.Marca;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record ProductRecordDto(@NotBlank String name, @NotNull BigDecimal value, @NotNull Double price, Boolean active, @NotBlank Categoria categoria, @NotBlank Marca marca) {

}
