package com.TTEnriching.TTEnriching.repository;

import com.TTEnriching.TTEnriching.model.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface RegisterDataRepository extends JpaRepository<Repository, Long> {
}
