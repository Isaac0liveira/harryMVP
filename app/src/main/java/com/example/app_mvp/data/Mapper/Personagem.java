package com.example.app_mvp.data.Mapper;

public class Personagem {
    private int id;
    private String name;
    private String species;
    private String gender;
    private String house;
    private String dateOfBirth;
    private String yearOfBirth;
    private String ancestry;
    private String patronus;
    private String actor;
    private String image;

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

    public String getSpecies() {
        if(species.equals("human")) {
            return "Humano";
        }else if(species.equals("half-giant")){
            return "Meio-Gigante";
        }else if(species.equals("werewolf")){
            return "Lobisomem";
        }else if(species.equals("cat")){
            return "Gato";
        }else{
            return "Desconhecido";
        }
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getGender() {
        if(gender.equals("male")){
            return "Masculino";
        }else{
            return "Feminino";
        }
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHouse() {
        if(house.equals("Gryffindor")){
            return "Grifinória";
        }else if(house.equals("Slytherin")){
            return "Sonserina";
        }else if(house.equals("Ravenclaw")){
            return "Corvinal";
        }else{
            return "Sem Casa";
        }
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getAncestry() {
        return ancestry;
    }

    public void setAncestry(String ancestry) {
        this.ancestry = ancestry;
    }

    public String getPatronus() {
        return patronus;
    }

    public void setPatronus(String patronus) {
        this.patronus = patronus;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
