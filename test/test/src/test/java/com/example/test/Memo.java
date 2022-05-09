package com.example.test;

import lombok.*;
import lombok.Data;

import javax.persistence.*;

@Entity

@Table(name="tbl_memo")

@Data

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Memo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mno;

    @Column
    private String memoText;
}
