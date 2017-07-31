package com.pet.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by 向博文 on 2017/7/31.
 */
@Entity
@Table(name = "t_cat")
public class Cat extends Pet{

    public Cat() {
    }
}
