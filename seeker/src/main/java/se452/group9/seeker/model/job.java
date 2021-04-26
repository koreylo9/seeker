package se452.group9.seeker.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;


@Entity
@Table(name = "jobs")
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String title;
    @Column(name="description")
    private String desc;
    //private Date createdDate;
    //private Boolean isActive;
    // private string jobType;
    // private int postedByID;
    // private int companyID;
    // private jobSkills

    //Constructor
    // public Job(int id, String title, String description, Boolean isActive){
    //     this.id = id;
    //     this.title = title;
    //     this.description = description;
    //     this.createdDate = createdDate;
    //     this.isActive = isActive;
    // }
    //Getters and Setters

    public Long getID(){
        return id;
    }

    public void setID(Long id){
        this.id = id;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getDescription(){
        return desc;
    }

    public void setDescription(String description){
        this.desc = description;
    }

    // public Date getCreatedDate(){
    //     return createdDate;
    // }

    // public void setCreatedDate(Date createdDate){
    //     this.createdDate = createdDate;
    // }

    // public Boolean getIsActive(){
    //     return isActive;
    // }

    // public void setIsActive(Boolean isActive){
    //     this.isActive = isActive;
    // }

}