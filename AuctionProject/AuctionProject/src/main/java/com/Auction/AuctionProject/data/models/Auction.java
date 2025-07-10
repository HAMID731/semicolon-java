package com.Auction.AuctionProject.data.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "auctions")
public class Auction {

    @Id
    private String auctionId;

    @Field("item_id")
    private String itemId;

    @Field("start_time")
    private LocalDateTime startTime;

    @Field("end_time")
    private LocalDateTime endTime;

    @Field("start_price")
    private BigDecimal startPrice;

    @Field("reserve_price")
    private BigDecimal reservePrice;

    @Field("current_highest_bid")
    private BigDecimal currentHighestBid;

    @Field("bidder_id")
    private String bidderId; // References the User document of the current highest bidder

    @Field("bid_time")
    private LocalDateTime bidTime; // Time of the current highest bid

    @Field("auction_status")
    private String auctionStatus = "Active"; // Active, Ended, Sold, Unsold, Cancelled

   }