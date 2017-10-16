package com.laioffer.eventreporter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chloe on 9/25/2017.
 */

public class DataService {
    /**
     * Fake all the event data for now. We will refine this and connect
     * to our backend later.
     */
    static String[][] events = {
            {"Mini Golf", "1184 W valley Blvd, CA 90101", "This is a huge event"},
            {"Indoor Rock Climbing", "1184 W valley Blvd, CA 90101", "This is a huge event"},
            {"Tequila Tasting", "1184 W valley Blvd, CA 90101", "This is a huge event"},
            {"Murder Mystery Dinner", "1184 W valley Blvd, CA 90101", "This is a huge event"},
            {"VIP Winery Tour", "1184 W valley Blvd, CA 90101", "This is a huge event"},
            {"Painting Class for Two", "1184 W valley Blvd, CA 90101", "This is a huge event"},
            {"Michael Jackson Tribute Concert", "1184 W valley Blvd, CA 90101", "This is a huge event"},
            {"Watercraft Rentals", "1184 W valley Blvd, CA 90101", "This is a huge event"},
            {"Harbor Cruise", "1184 W valley Blvd, CA 90101", "This is a huge event"},
            {"Animal Sanctuary Trip", "1184 W valley Blvd, CA 90101", "This is a huge event"},
            {"Kayaking", "1184 W valley Blvd, CA 90101", "This is a huge event"}
    };
    static Integer[] eventImage = {
            R.drawable.e2,
            R.drawable.e3,
            R.drawable.e4,
            R.drawable.e5,
            R.drawable.e6,
            R.drawable.e7,
            R.drawable.e8,
            R.drawable.e9,
            R.drawable.e10,
            R.drawable.e11,
            R.drawable.e12
    };
    public static List<Event> getEventData() {
        List<Event> eventData = new ArrayList<Event>();
        for (int i = 0; i < 10; ++i) {
            eventData.add(
                    new Event(events[i][0], events[i][1], events[i][2], eventImage[i]));
        }
        return eventData;
    }
}

