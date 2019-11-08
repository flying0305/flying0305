package com.zff.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zff.entities.Flower;

/*
 *在dao层的接口上一定要加@mapper的注解，springBoot和mybatis整合需要识别他*/
@Mapper
public interface FlowerDao {
	List<Flower> selectFlower();
	boolean insertFlower(Flower flower);
}
