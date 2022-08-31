package com.portfolio.portfolio.model;

import javax.persistence.*;

@Entity
@Table(name = "aboutus")
public class AboutUs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    
    @Column(name = "title")
    private String title;
    
    @Column(name = "aboutdescription", length = 600)
    private String aboutdescription;
    
    @Column(name = "avatarimg")
    private String avatarimg;
    
    @Column(name = "backgroundimage")
    private String backgroundimage;

    @Column(name = "age")
    private int age;
    
    @Column(name = "location")
    private String location;
    
    @Column(name = "phone")
    private String phone;
    
    @Column(name = "email")
    private String email;
    
    @Column(name = "cvlink")
    private String cvlink;
    
    @Column(name = "facebook")
    private String facebook;
    
    @Column(name = "instagram")
    private String instagram;
    
    @Column(name = "twitter")
    private String twitter;
    
    @Column(name = "linkedin")
    private String linkedin;
    
    @Column(name = "github")
    private String github;
    
    @Column(name = "youtube")
    private String youtube;

    public AboutUs() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAboutdescription() {
        return aboutdescription;
    }

    public void setAboutdescription(String aboutdescription) {
        this.aboutdescription = aboutdescription;
    }

    public String getAvatarimg() {
        return avatarimg;
    }

    public void setAvatarimg(String avatarimg) {
        this.avatarimg = avatarimg;
    }

    public String getBackgroundimage() {
        return backgroundimage;
    }

    public void setBackgroundimage(String backgroundimage) {
        this.backgroundimage = backgroundimage;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCvlink() {
        return cvlink;
    }

    public void setCvlink(String cvlink) {
        this.cvlink = cvlink;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getYoutube() {
        return youtube;
    }

    public void setYoutube(String youtube) {
        this.youtube = youtube;
    }
    
    
    

}
