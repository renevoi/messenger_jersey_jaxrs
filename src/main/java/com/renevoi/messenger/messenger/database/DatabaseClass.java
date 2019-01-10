package com.renevoi.messenger.messenger.database;

import com.renevoi.messenger.messenger.model.Message;
import com.renevoi.messenger.messenger.model.Profile;

import java.util.HashMap;
import java.util.Map;

public class DatabaseClass {

    private static Map<Integer, Message> messages = new HashMap<>();
    private static Map<String, Profile> profiles = new HashMap<>();


    public static Map<Integer, Message> getMessages(){
        return messages;
    }

    public static Map<String, Profile> getProfiles(){
        return profiles;
    }

}
