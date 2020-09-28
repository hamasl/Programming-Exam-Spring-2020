package org.example.toll;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class TollPassageRegister implements Iterable<TollPassage>{
  private final List<TollPassage> TOLL_PASSAGES = new ArrayList<>();

  TollPassageRegister() {
    //Default constructor
  }

  boolean addTollPassage(final int TOLL_PLAZA_ID, final String PASSING_VEHICLE_LICENSE_PLATE_NUMBER, final int COST, final LocalTime TIME_OF_PASSING, final LocalDate DATE_OF_PASSING ){
    return TOLL_PASSAGES.add(new TollPassage(TOLL_PLAZA_ID, PASSING_VEHICLE_LICENSE_PLATE_NUMBER, COST, TIME_OF_PASSING, DATE_OF_PASSING));
  }

  List<TollPassage> getTOLL_PASSAGES() {
    return TOLL_PASSAGES;
  }

  @Override
  public Iterator<TollPassage> iterator() {
    return TOLL_PASSAGES.iterator();
  }

  @Override
  public String toString() {
    StringBuilder tollPassagesRegistered = new StringBuilder("Toll passages registered");
    TOLL_PASSAGES.forEach(s -> tollPassagesRegistered.append("\n\n").append(s.toString()));
    return tollPassagesRegistered.toString();
  }
}
