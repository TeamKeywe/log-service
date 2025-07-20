package com.doubleo.logservice.domain.stats.repository;

import com.doubleo.logservice.domain.stats.domain.DailyRetainedSnapshot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientGuardianEntryNumRepository extends JpaRepository<DailyRetainedSnapshot, Long> {
}
