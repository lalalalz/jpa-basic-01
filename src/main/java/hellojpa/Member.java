package hellojpa;

import lombok.Data;

import javax.annotation.processing.Generated;
import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@Entity
public class Member {

    @Id @GeneratedValue
    @Column("MEMBER_ID")
    private Long id;

    @ManyToOne
    private Team team;

    private String username;
}
