package ua.kpi.tef.KPIBoardAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.kpi.tef.KPIBoardAPI.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
