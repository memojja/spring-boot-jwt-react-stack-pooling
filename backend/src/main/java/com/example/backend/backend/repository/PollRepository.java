package com.example.backend.backend.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;
import com.example.backend.backend.model.PollItem;

@Repository
public interface PollRepository extends JpaRepository<PollItem, Long> {
    Optional<PollItem> findById(Long pollId);

//    PollItem findByCreatedBy(Long userId);

    Page<PollItem> findByCreatedBy(Long userId, Pageable pageable);

    long countByCreatedBy(Long userId);

    List<PollItem> findByIdIn(List<Long> pollIds);

    List<PollItem> findByIdIn(List<Long> pollIds, Sort sort);
}