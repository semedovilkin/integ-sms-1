package az.com.cybernet.integ.integsms.domain.entity.base;

import az.com.cybernet.integ.integsms.util.LocalDateTimeSerializer;
import az.com.cybernet.integ.integsms.util.LocalDatetimeDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public abstract class AbstractEntity {
    @CreationTimestamp
    @Column(name = "created_at")
    @JsonDeserialize(using = LocalDatetimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    protected LocalDateTime createdAt;
    @UpdateTimestamp
    @Column(name = "updated_at")
    @JsonDeserialize(using = LocalDatetimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    protected LocalDateTime updatedAt;


}