package org.main;

public class Passenger {

    private String pclass;
    private String survived;
    private String name;
    private String sex;
    private float age;
    private String sibsp;
    private String parch;
    private String ticket;
    private float fare;
    private String cabin;
    private String embarked;
    private String boat;
    private String body;
    private String home_dist;

    public String getPclass() {
        return pclass;
    }

    public void setPclass(String pclass) {
        this.pclass = pclass;
    }

    public String getSurvived() {
        return survived;
    }

    public void setSurvived(String survived) {
        this.survived = survived;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public String getSibsp() {
        return sibsp;
    }

    public void setSibsp(String sibsp) {
        this.sibsp = sibsp;
    }

    public String getParch() {
        return parch;
    }

    public void setParch(String parch) {
        this.parch = parch;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public float getFare() {
        return fare;
    }

    public void setFare(float fare) {
        this.fare = fare;
    }

    public String getCabin() {
        return cabin;
    }

    public void setCabin(String cabin) {
        this.cabin = cabin;
    }

    public String getEmbarked() {
        return embarked;
    }

    public void setEmbarked(String embarked) {
        this.embarked = embarked;
    }

    public String getBoat() {
        return boat;
    }

    public void setBoat(String boat) {
        this.boat = boat;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getHome_dist() {
        return home_dist;
    }

    public void setHome_dist(String home_dist) {
        this.home_dist = home_dist;
    }

    @Override
    public String toString() {
        return " pclass: " + pclass+
                " , survived: " +survived+
                " , name: " + name+
                " , sex: " + sex+
                " , age: " + age+
                " , sibsp: " + sibsp+
                " , parch: " + parch+
                " , ticket: " + ticket+
                " , fare: " + fare+
                " , cabin: " + cabin+
                " , embarked: " + embarked+
                " , boat " + boat+
                " , body: " + body+
                ", home_dist: " + home_dist+"\n";
    }
}
