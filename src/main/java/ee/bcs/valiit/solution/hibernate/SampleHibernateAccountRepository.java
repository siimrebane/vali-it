package ee.bcs.valiit.solution.hibernate;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SampleHibernateAccountRepository extends JpaRepository<SampleAccount, String> {
}
