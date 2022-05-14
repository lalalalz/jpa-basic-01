package hellojpa;

import lombok.Data;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@Entity
public class Member {
    @Id
    private Long id;
    @Column
    private String name;
    @Column(nullable = false)
    private Integer age;

    @Enumerated(EnumType.STRING)
    private RoleType roleType;

    private LocalDateTime testLocalDateTime;
    private LocalTime testLocalTime;

    @Lob
    private String desc;
    @Lob
    private BigInteger code;

    @Transient
    private String temp;
}
