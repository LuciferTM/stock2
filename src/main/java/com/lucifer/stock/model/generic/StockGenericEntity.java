package com.lucifer.stock.model.generic;

import org.hibernate.Hibernate;

import java.io.Serializable;

/**
 * <p>Title:</p>
 * <p>Description: </p>
 * <p>Company:</p>
 *
 * @author Lucifer
 * @date 2017/12/19
 */

public abstract class StockGenericEntity <K extends Serializable & Comparable<K>, E extends StockGenericEntity<K, ?>>
        implements Serializable, Comparable<E> {
    public abstract K getId();


    public abstract void setId(K id);


    public boolean isNew() {
        return getId() == null;
    }


    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (object == this) {
            return true;
        }


        if (Hibernate.getClass(object) != Hibernate.getClass(this)) {
            return false;
        }

        StockGenericEntity<K, E> entity = (StockGenericEntity<K, E>) object;
        K id = getId();

        if (id == null) {
            return false;
        }

        return id.equals(entity.getId());
    }

    @Override
    public int hashCode() {
        int hash = 7;

        K id = getId();
        hash = 31 * hash + ((id == null) ? 0 : id.hashCode());

        return hash;
    }

    public int compareTo(E o) {
        if (this == o) {
            return 0;
        }
        return this.getId().compareTo(o.getId());
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("entity.");
        builder.append(Hibernate.getClass(this).getSimpleName());
        builder.append("<");
        builder.append(getId());
        builder.append("-");
        builder.append(super.toString());
        builder.append(">");

        return builder.toString();
    }
}
