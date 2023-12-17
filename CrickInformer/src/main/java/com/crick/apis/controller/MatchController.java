package com.crick.apis.controller;

import com.crick.apis.entities.Match;
import com.crick.apis.services.MatchServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/match")
public class MatchController {

    private MatchServices matchServices;

    public MatchController(MatchServices matchServices) {
        this.matchServices = matchServices;
    }

    @GetMapping("/live")
    public ResponseEntity<List<Match>> getLiveMatches()
    {
        return new ResponseEntity<>(this.matchServices.getLiveMatches(), HttpStatus.OK);
    }

    @GetMapping("/allmatches")
    public ResponseEntity<List<Match>> getAllMatches()
    {
        return new ResponseEntity<>(this.matchServices.getAllMatches(),HttpStatus.OK);
    }


    @GetMapping("/point-table")
    public ResponseEntity<?> getPointTable()
    {
        return new ResponseEntity<>(this.matchServices.getPointTable(),HttpStatus.OK);
    }
}
