package edu.miu.cs425soamsapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Patient {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
}
