package az.com.cybernet.integ.integsms.domain.entity;

import az.com.cybernet.integ.integsms.domain.entity.base.AbstractEntity;
import az.com.cybernet.integ.integsms.domain.enumeration.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

import static az.com.cybernet.integ.integsms.domain.entity.constant.DatabaseConstant.DEFAULT_SCHEMA;
import static az.com.cybernet.integ.integsms.domain.entity.constant.DatabaseConstant.JOIN_NOTIFICATION;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = Account.TABLE_NAME, schema = DEFAULT_SCHEMA)
public class Account extends AbstractEntity {

    public static final String TABLE_NAME = "account";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String phone;
    private String email;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = JOIN_NOTIFICATION)
    private Set<Notification> notifications;

    @Enumerated(EnumType.STRING)
    private Status status;
}
