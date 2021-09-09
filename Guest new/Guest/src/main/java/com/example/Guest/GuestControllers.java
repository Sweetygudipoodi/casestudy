package com.example.Guest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/")
public class GuestControllers {

    @Autowired
    private GuestRepository guestRepository;

    @GetMapping("/allguests")
    public List<Guest> getAllGuests(){
        return guestRepository.findAll();
    }

    @PostMapping("/addguest")
    public void addGuest(@RequestBody Guest newGuest){
    	guestRepository.save(newGuest);
    }
}
