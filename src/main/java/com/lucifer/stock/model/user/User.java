package com.lucifer.stock.model.user;

import com.lucifer.stock.model.generic.StockGenericEntity;

import javax.persistence.*;

/**
 * <p>Title:</p>
 * <p>Description: </p>
 * <p>Company:</p>
 *
 * @author Lucifer
 * @date 2017/12/12
 */
@Table
@Entity
public class User extends StockGenericEntity<Integer, User> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    public User(){

    }
    public User(String name) {
        this.name = name;
    }
    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
    public Integer getId() {
        return id;
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
    @Override
    public String toString() {
        return "id:"+id+",name:"+name;
    }
}
