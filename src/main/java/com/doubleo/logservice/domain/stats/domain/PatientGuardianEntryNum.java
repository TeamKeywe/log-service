package com.doubleo.logservice.domain.stats.domain;

import com.doubleo.logservice.domain.common.model.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(
        name = "patient_guardian_entry_num",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = {"tenant_id", "patient_id"})
        })
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class PatientGuardianEntryNum extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "snapshot_id")
    private Long id;

    @Column(name = "patient_id", nullable = false)
    private Long patientId;

    @Column(name = "retained_guardian_count", nullable = false)
    private int retainedGuardianCount;

    public PatientGuardianEntryNum(
            String tenantId,
            Long patientId,
            int retainedGuardianCount) {
        this.tenantId = tenantId;
        this.patientId = patientId;
        this.retainedGuardianCount = retainedGuardianCount;
    }
}