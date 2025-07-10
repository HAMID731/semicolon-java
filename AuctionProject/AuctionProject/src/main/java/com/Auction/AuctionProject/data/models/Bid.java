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
@Document(collection = "bids")
public class Bid {

    @Id
    private String bidId;

    @Field("auction_id")
    private String auctionId;

    @Field("bidder_id")
    private String bidderId;

    @Field("bid_amount")
    private BigDecimal bidAmount;

    @Field("bid_time")
    private LocalDateTime bidTime = LocalDateTime.now();


}