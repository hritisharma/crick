package com.crick.apis.services;

import com.crick.apis.entities.Match;

import java.util.List;
import java.util.Map;

public interface MatchServices {

   List<Match> getAllMatches();

   List<Match> getLiveMatches();

   List<List<String>> getPointTable();


}
