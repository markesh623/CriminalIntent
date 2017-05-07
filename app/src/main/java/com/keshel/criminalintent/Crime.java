package com.keshel.criminalintent;

import java.util.UUID;

/**
 * Created by Mark on 5/7/2017.
 */

public class Crime extends Object {

    private UUID mId;
    private String mTitle;

    public Crime() {
        // Generate unique identifier
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}
