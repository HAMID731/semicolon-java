package com.Auction.AuctionProject.data.repositories;

import com.Auction.AuctionProject.data.models.Auction;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface AuctionRepository extends MongoRepository<Auction, String> {

    List<Auction> findByItemId(String itemId);
    List<Auction> findByAuctionStatus(String status);
    List<Auction> findByEndTimeBefore(LocalDateTime dateTime);
}