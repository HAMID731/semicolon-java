package com.Auction.AuctionProject.data.repositories;

import com.Auction.AuctionProject.data.models.Item;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends MongoRepository<Item, String> {

    List<Item> findByCategory(String category);
    List<Item> findByTitleContainingIgnoreCase(String keyword);
    List<Item> findBySellerId(String sellerId);
    List<Item> findByAuctionStatus(String status);
}