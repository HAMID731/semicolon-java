package com.Auction.AuctionProject.data.repositories;

import com.Auction.AuctionProject.data.models.Bid;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BidRepository extends MongoRepository<Bid, String> {

    List<Bid> findByAuctionIdOrderByBidAmountDescBidTimeAsc(String auctionId);
    List<Bid> findByBidderIdOrderByBidTimeDesc(String bidderId);
    Bid findTopByAuctionIdOrderByBidAmountDescBidTimeAsc(String auctionId);
}
