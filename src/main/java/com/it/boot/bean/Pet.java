package com.it.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author ZuYingFang
 * @time 2021-09-11 17:28
 */


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pet {

    private String name;
    private Double weight;

}
