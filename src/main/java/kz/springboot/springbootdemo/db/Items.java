package kz.springboot.springbootdemo.db;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public final class Items {
    private Long id;
    private String name;
    private String description;
    private double price;
}
