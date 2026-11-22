package kz.iitu.registration.repository;

import kz.iitu.registration.model.EventInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<EventInfo, Integer> {
}