package com.Auction.AuctionProject.data.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "items")
public class Item {

    @Id
    private String itemId;

    @Field("seller_id")
    private String sellerId;

    private String title;
    private String description;
    private String category;

    @Field("image_urls")
    private List<String> imageUrls;

    @Field("starting_price")
    private BigDecimal startingPrice;

    @Field("reserve_price")
    private BigDecimal reservePrice;

    @Field("current_bid")
    private BigDecimal currentBid;

    @Field("bid_count")
    private Integer bidCount = 0;

    @Field("start_time")
    private LocalDateTime startTime;

    @Field("end_time")
    private LocalDateTime endTime;

    @Field("auction_status")
    private String auctionStatus = "Active";


}
