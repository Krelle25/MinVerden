package com.example.minverden.model;

public class Presentation
{
    private String title;
    private String description;
    private String imagePath;

    public Presentation(String title, String description, String imagePath)
    {
        this.title = title;
        this.description = description;
        this.imagePath = imagePath;
    }

    public String getTitle()
    {
        return title;
    }

    public String getDescription()
    {
        return description;
    }

    public String getImagePath()
    {
        return imagePath;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public void setImagePath(String imagePath)
    {
        this.imagePath = imagePath;
    }
}
