package com.simanavets.tenderflexbackend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    private List<Role> roles = new ArrayList<>();


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

