package hellojpa;

import lombok.Data;

import javax.annotation.processing.Generated;
import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@Entity
@SequenceGenerator(
        name = "MEMBER_SEQ_GENERATOR",
        sequenceName = "MY_SEQUENCES",
        initialValue = 1,
        allocationSize = 50
)
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MEMBER_SEQ_GENERATOR")
    private Long id;
    private String name;
//    @Column
//    private String name;
//    @Column(nullable = false)
//    private Integer age;
//
//    @Enumerated(EnumType.STRING)
//    private RoleType roleType;
//
//    private LocalDateTime testLocalDateTime;
//    private LocalTime testLocalTime;
//
//    @Lob
//    private String desc;
//    @Lob
//    private BigInteger code;
//
//    @Transient
//    private String temp;
}
