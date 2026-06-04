package com.collabify.backend.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import com.collabify.backend.model.Event;
import com.collabify.backend.repository.EventRepository;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class EventServiceTest {

    @Mock
    private EventRepository eventRepository;

    @InjectMocks
    private EventService eventService;

    public EventServiceTest() {

        MockitoAnnotations.openMocks(this);

    }

    @Test
    void testGetAllEvents() {

        Event event = new Event();

        event.setTitle("Meeting");
        event.setDate("2026-05-28");

        when(eventRepository.findAll())
                .thenReturn(Arrays.asList(event));

        List<Event> events =
                eventService.getAllEvents();

        assertEquals(1, events.size());
        assertEquals("Meeting",
                events.get(0).getTitle());
    }
}