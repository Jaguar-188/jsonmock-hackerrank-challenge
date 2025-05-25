package com.example.jsonMockHackerrank.entity;

public class Marathons {

    private String name;
    private String sex;
    private String id;
    private long age;
    private double top_speed;
    private double bottom_speed;
    private double average_speed;
    private long avgheartbeat;
    private double distance_run;
    private String marathon_name;
    private String country;
    private long number_of_participants;
    private long personal_best_time;
    private long stops_taken;
    private long position;

    public Marathons(String name, String sex, String id, long age, double top_speed, double bottom_speed, double average_speed, long avgheartbeat, double distance_run, String marathon_name, String country, long number_of_participants, long personal_best_time, long stops_taken, long position) {
        this.name = name;
        this.sex = sex;
        this.id = id;
        this.age = age;
        this.top_speed = top_speed;
        this.bottom_speed = bottom_speed;
        this.average_speed = average_speed;
        this.avgheartbeat = avgheartbeat;
        this.distance_run = distance_run;
        this.marathon_name = marathon_name;
        this.country = country;
        this.number_of_participants = number_of_participants;
        this.personal_best_time = personal_best_time;
        this.stops_taken = stops_taken;
        this.position = position;
    }

    public Marathons() {
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public double getTop_speed() {
        return top_speed;
    }

    public void setTop_speed(double top_speed) {
        this.top_speed = top_speed;
    }

    public double getBottom_speed() {
        return bottom_speed;
    }

    public void setBottom_speed(double bottom_speed) {
        this.bottom_speed = bottom_speed;
    }

    public double getAverage_speed() {
        return average_speed;
    }

    public void setAverage_speed(double average_speed) {
        this.average_speed = average_speed;
    }

    public long getAvgheartbeat() {
        return avgheartbeat;
    }

    public void setAvgheartbeat(long avgheartbeat) {
        this.avgheartbeat = avgheartbeat;
    }

    public double getDistance_run() {
        return distance_run;
    }

    public void setDistance_run(double distance_run) {
        this.distance_run = distance_run;
    }

    public String getMarathon_name() {
        return marathon_name;
    }

    public void setMarathon_name(String marathon_name) {
        this.marathon_name = marathon_name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public long getNumber_of_participants() {
        return number_of_participants;
    }

    public void setNumber_of_participants(long number_of_participants) {
        this.number_of_participants = number_of_participants;
    }

    public long getPersonal_best_time() {
        return personal_best_time;
    }

    public void setPersonal_best_time(long personal_best_time) {
        this.personal_best_time = personal_best_time;
    }

    public long getStops_taken() {
        return stops_taken;
    }

    public void setStops_taken(long stops_taken) {
        this.stops_taken = stops_taken;
    }

    public long getPosition() {
        return position;
    }

    public void setPosition(long position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Marathons{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                ", top_speed=" + top_speed +
                ", bottom_speed=" + bottom_speed +
                ", average_speed=" + average_speed +
                ", avgheartbeat=" + avgheartbeat +
                ", distance_run=" + distance_run +
                ", marathon_name='" + marathon_name + '\'' +
                ", country='" + country + '\'' +
                ", number_of_participants=" + number_of_participants +
                ", personal_best_time=" + personal_best_time +
                ", stops_taken=" + stops_taken +
                ", position=" + position +
                '}';
    }
}
