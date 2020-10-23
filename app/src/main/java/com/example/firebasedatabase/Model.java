package com.example.firebasedatabase;

public class Model {
    String Id, Img, Name, Age, Adress;

    public Model() {
    }

    public Model(String id, String img, String name, String age, String adress) {
        Id = id;
        Img = img;
        Name = name;
        Age = age;
        Adress = adress;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getImg() {
        return Img;
    }

    public void setImg(String img) {
        Img = img;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String adress) {
        Adress = adress;
    }
}
