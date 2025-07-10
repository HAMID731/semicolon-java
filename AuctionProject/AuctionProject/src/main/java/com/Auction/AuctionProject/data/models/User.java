package com.Auction.AuctionProject.data.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "users")
public class User {

    @Id
    private String id;

    private String username;

    private String password;
    private String email;

    @Field("registration_date")
    private LocalDateTime registrationDate = LocalDateTime.now();

    @Field("user_type")
    private String userType = "Buyer";

}