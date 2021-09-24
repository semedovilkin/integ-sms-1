package az.com.cybernet.integ.integsms.domain.mapper;

import az.com.cybernet.integ.integsms.domain.dto.NotificationResponsePostDTO;
import az.com.cybernet.integ.integsms.domain.entity.NotificationAction;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface NotificationActionMapper {
    NotificationActionMapper INSTANCE = Mappers.getMapper(NotificationActionMapper.class);

    NotificationAction getEntity(NotificationResponsePostDTO dto);
}
