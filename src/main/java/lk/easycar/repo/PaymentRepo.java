package lk.easycar.repo;

import lk.easycar.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepo extends JpaRepository<Payment,String> {
}
