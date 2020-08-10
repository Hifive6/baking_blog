package com.bakingcrud.springbootthymeleafcookingapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
// import javax.persistence.Lob;
import javax.persistence.Table;

// import org.apache.tomcat.util.codec.binary.Base64;
// import org.springframework.web.multipart.MultipartFile;
// import org.springframework.web.multipart.commons.CommonsMultipartFile;

// import org.apache.tomcat.util.codec.binary.Base64;


@Entity
@Table(name = "bakes")
public class Info  {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    // @Lob
    @Column(name = "image")
    private byte[] image;

    @Column(name = "pictures")
    private String pic;
    // @Column(name = "images")
    // private CommonsMultipartFile[] image;

//    public String generateBase64Image(){
//        return Base64.encodeBase64String(this.getImage());
//    }

    
    public String getFullName(){
        return getFirstName() + getLastName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

   

    public Info( String firstName, String lastName, String title, String description, byte[] image, String pic) {
        // this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.description = description;
        this.image = image;
        this.pic = pic;
    }

    public Info(){}

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    

    

}