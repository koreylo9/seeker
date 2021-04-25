package se452.group9.seeker.model;

import java.sql.Date;

public class Job {

    private int id;
    private String title;
    private String description;
    private Date createdDate;
    private Boolean isActive;
    // private string jobType;
    // private int postedByID;
    // private int companyID;
    // private jobSkills

    //Constructor
    public Job(int id, String title, String description, Boolean isActive){
        this.id = id;
        this.title = title;
        this.description = description;
        this.createdDate = createdDate;
        this.isActive = isActive;
    }
    //Getters and Setters

    public int getID(){
        return id;
    }

    public void setID(int id){
        this.id = id;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public Date getCreatedDate(){
        return createdDate;
    }

    public void setCreatedDate(Date createdDate){
        this.createdDate = createdDate;
    }

    public Boolean getIsActive(){
        return isActive;
    }

    public void setIsActive(Boolean isActive){
        this.isActive = isActive;
    }

}