package ee.bcs.valiit.respository2;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository2  extends JpaRepository<AccountEntity, Long> {
    AccountEntity getAccountByAccountNr(String accountNr);

}
