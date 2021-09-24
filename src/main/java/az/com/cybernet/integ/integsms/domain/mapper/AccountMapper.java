package az.com.cybernet.integ.integsms.domain.mapper;

import az.com.cybernet.integ.integsms.domain.dto.AccountPostDTO;
import az.com.cybernet.integ.integsms.domain.entity.Account;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AccountMapper {

    AccountMapper INSTANCE = Mappers.getMapper(AccountMapper.class);

    AccountPostDTO entityToDto(Account account);

    Account dtoToEntity(AccountPostDTO dto);

}