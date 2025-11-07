package com.web.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "category")
@Getter
@Setter
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String name;

    private String image;

    @Transient
    private Long idParent;

    @Transient
    private String parentName;

    @ManyToOne
    @JsonBackReference
    private ParentCategory parentCategory;

    public Long getIdParent() {
        return this.parentCategory != null ? this.parentCategory.getId() : null;
    }

    public String getParentName() {
        return this.parentCategory != null ? this.parentCategory.getName() : null;
    }
}
