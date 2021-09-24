package az.com.cybernet.integ.integsms.domain.entity;

import az.com.cybernet.integ.integsms.domain.entity.base.AbstractEntity;
import az.com.cybernet.integ.integsms.domain.enumeration.NotificationTypeEnum;
import az.com.cybernet.integ.integsms.domain.enumeration.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static az.com.cybernet.integ.integsms.domain.entity.constant.DatabaseConstant.DEFAULT_SCHEMA;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = Subscription.TABLE_NAME, schema = DEFAULT_SCHEMA)
public class Subscription extends AbstractEntity {

    public static final String TABLE_NAME = "subscription";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String phone;

    @Enumerated(EnumType.STRING)
    private NotificationTypeEnum notificationType;

    @Enumerated(EnumType.STRING)
    private Status status;
}
