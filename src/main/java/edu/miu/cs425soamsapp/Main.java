package edu.miu.cs425soamsapp;

import edu.miu.cs425soamsapp.model.Patient;

import java.util.List;

public class Main {
public static void main(String[] args) {

    var publishers = List.of(
            new Patient(100,"jonh", "doe", "john.com", "123-456-9876"),
            new Patient(102,"smith", "doe", "smith.com", "123-456-9876"),
            new Patient(103,"Mike", "Adam", "mike.com", "123-456-9876"),
            new Patient(104,"luwam", "wel", "luwam.com", "123-456-9876")
    );

    publishers.forEach(System.out::println);
}




}
