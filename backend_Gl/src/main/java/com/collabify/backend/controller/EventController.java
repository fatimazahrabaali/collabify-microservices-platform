package com.collabify.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.collabify.backend.model.Event;
import com.collabify.backend.service.EventService;

@RestController
@RequestMapping("/events")
@CrossOrigin(origins = "http://localhost:3000")
public class EventController {

    @Autowired
    private EventService eventService;

    // GET ALL EVENTS
    @GetMapping
    public List<Event> getAllEvents() {

        return eventService.getAllEvents();

    }

    // ADD EVENT
    @PostMapping
    public Event createEvent(
            @RequestBody Event event) {

        return eventService.createEvent(event);

    }

    // DELETE EVENT
    @DeleteMapping("/{id}")
    public void deleteEvent(
            @PathVariable Long id) {

        eventService.deleteEvent(id);

    }
}