package br.com.mlb.rediscache.product;

import java.io.Serializable;

public record Product(Long id, String name, String description) implements Serializable {
}
