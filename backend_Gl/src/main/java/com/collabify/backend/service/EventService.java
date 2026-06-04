package com.collabify.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.collabify.backend.model.Event;
import com.collabify.backend.repository.EventRepository;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    // GET ALL EVENTS
    public List<Event> getAllEvents() {

        return eventRepository.findAll();

    }

    // CREATE EVENT
    public Event createEvent(Event event) {

        return eventRepository.save(event);

    }

    // DELETE EVENT
    public void deleteEvent(Long id) {

        eventRepository.deleteById(id);

    }
}