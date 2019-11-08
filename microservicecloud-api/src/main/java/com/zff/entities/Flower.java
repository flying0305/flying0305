package com.zff.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/* 
 * 实体两点
 * 1：在pom的坐标里放入lombok，引入包后可以用一下四个注解
 * 2：实体必须实现serializable接口 
*/
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors
public class Flower implements Serializable {
	public Integer id;
	public String  fname;
	public String  price;
}
