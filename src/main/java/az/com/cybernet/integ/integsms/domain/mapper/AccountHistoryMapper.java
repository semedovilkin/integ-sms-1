package az.com.cybernet.integ.integsms.domain.mapper;

import az.com.cybernet.integ.integsms.domain.dto.AccountHistoryResponseDTO;
import az.com.cybernet.integ.integsms.domain.entity.Account;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AccountHistoryMapper {

    AccountHistoryMapper INSTANCE = Mappers.getMapper(AccountHistoryMapper.class);

    AccountHistoryResponseDTO entityToDto(Account account);
}
