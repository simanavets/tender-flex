package com.simanavets.tenderflexbackend.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Privilege {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    private PrivilegeName name;

    @ManyToMany(mappedBy = "privileges")
    @JsonBackReference
    private List<Role> roles;


}

enum PrivilegeName {
    READ_TENDER,
    CREATE_OFFER,
    READ_OFFER,
    READ_CONTRACT_STATUS,
    READ_CONTRACT_PDF,
    APPROVE_DECLINE_CONTRACT,
    CRATE_TENDER,
    PUBLISH_TENDER,
    ACCEPT_DECLINE_OFFER,
    UPLOAD_CONTRACT
}

