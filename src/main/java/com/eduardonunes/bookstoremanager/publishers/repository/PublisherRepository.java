package com.eduardonunes.bookstoremanager.publishers.repository;

import com.eduardonunes.bookstoremanager.publishers.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}