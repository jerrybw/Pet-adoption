package com.pet.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Created by 向博文 on 2017/7/31.
 */
@MappedSuperclass
public abstract class Pet {
    private Integer id;//id
    private String name;//名字
    private String variety;//品种
    private double weight;//体重
    private Integer age;//年龄
    private char vaccine;//是否注射疫苗 y:已注射 n:未注射 d:未知
    private Integer ownerId;//主人id
    private char LookingForOwner;//是否在寻找主人 y:正在寻找 n:未在寻找
    private String pic;//照片地址
    @Id
    @GeneratedValue
    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Integer getId() {
        return id;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public char getVaccine() {
        return vaccine;
    }

    public void setVaccine(char vaccine) {
        this.vaccine = vaccine;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public char getLookingForOwner() {
        return LookingForOwner;
    }

    public void setLookingForOwner(char lookingForOwner) {
        LookingForOwner = lookingForOwner;
    }

}
