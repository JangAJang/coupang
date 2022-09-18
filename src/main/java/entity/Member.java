package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "MEMBER")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MEMBER_ID")
    private Long id;

    @Column(nullable = false, unique = true, name = "MEMBER_USERNAME")
    private String username;

    @Column(nullable = false, unique = true, name = "MEMBER_NICKNAME")
    private String nickname;

    @Column(nullable = false, name = "MEMBER_LAST-NAME")
    private String lastname;

    @Column(nullable = false, name = "MEMBER_FIRST-NAME")
    private String firstname;

    @Column(nullable = false, name = "MEMBER_PASSWORD")
    private String password;

    @Column(nullable = false, name = "MEMBER_RRN")
    private String rrn;

    @Column(nullable = false, name = "MEMBER_PHONE-NUMBER")
    private String phone;

    @Column(nullable = false, name = "MEMBER_CITY")
    private String city;

    @Column(nullable = false, name = "MEMBER_STREET")
    private String street;

    @Column(nullable = false, name = "MEMBER_ZIPCODE")
    private String zipcode;

    @Enumerated(EnumType.STRING)
    @Column(name = "MEMBER_ROLE")
    private RoleStatus roleStatus;
}
