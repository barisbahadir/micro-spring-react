package com.sha.microspringreact.model;

import lombok.Data;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "course")
public class Course {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
     private Long id;

    @Column(name = "title", length = 100, nullable = false)
    private String title;

    @Column(name="subtitle", length = 100, nullable = false)
    private String subtitle;

    @Column(name="price", nullable = false)
    private Double price;

    @Column(name="create_time", nullable = false)
    private LocalDateTime createtime;

}
