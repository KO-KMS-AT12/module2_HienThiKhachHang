package com.module.model;

public class Customers {
  private int id;
  private String name;
  private String birthday;
  private String address;
  private int image;

  public Customers(int id, String name, String birthday, String address, int image) {
    this.id = id;
    this.name = name;
    this.birthday = birthday;
    this.address = address;
    this.image = image;
  }

  public Customers() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBirthday() {
    return birthday;
  }

  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public int getImage() {
    return image;
  }

  public void setImage(int image) {
    this.image = image;
  }
}
