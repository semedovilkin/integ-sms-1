package az.com.cybernet.integ.integsms.domain.mapper;

import az.com.cybernet.integ.integsms.domain.dto.NotificationResponseDTO;
import az.com.cybernet.integ.integsms.domain.entity.Notification;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface NotificationMapper {
    NotificationMapper INSTANCE = Mappers.getMapper(NotificationMapper.class);

    NotificationResponseDTO entityToDto(Notification entity);

    Notification dtoToEntity(NotificationResponseDTO dto);
}
