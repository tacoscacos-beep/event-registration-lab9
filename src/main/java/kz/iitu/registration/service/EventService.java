package kz.iitu.registration.service;

import jakarta.annotation.PostConstruct;
import kz.iitu.registration.model.EventInfo;
import kz.iitu.registration.repository.EventRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    private final EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @PostConstruct
    public void initData() {
        if (eventRepository.count() == 0) {
            eventRepository.saveAll(List.of(
                    new EventInfo("Web Design Workshop", "Hall A"),
                    new EventInfo("JavaScript Quiz", "Lab 302"),
                    new EventInfo("IT Career Talk", "Main Auditorium")
            ));
        }
    }

    public String getWelcomeMessage() {
        return "Welcome to the Event Registration API";
    }

    public List<EventInfo> getAllEvents() {
        return eventRepository.findAll();
    }

    public EventInfo getEventById(int id) {
        return eventRepository.findById(id).orElse(null);
    }
}