package com.ecommerce.ecommerce.model;

import java.sql.Blob;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;


@Getter 
@Setter 
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ; 
    private String fileName ; 
    private String fileType ;
    private String filePath ; 
    
    @Lob
    private Blob image ; 
    private String url ;
    
    
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product ; 
    

}
