package org.launchcode.codingevents.data;
import org.launchcode.codingevents.models.EventType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventTypeRepository extends CrudRepository<EventType, Integer> {
}
