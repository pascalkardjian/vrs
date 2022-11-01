package com.example.vrs.model.repository;

import com.example.vrs.model.entity.Destination;
import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Modifying;
// import org.springframework.data.jpa.repository.Query;
// import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
// import org.springframework.transaction.annotation.Transactional;

@Repository
public interface DestinationRepository extends JpaRepository<Destination, Long> {
}
