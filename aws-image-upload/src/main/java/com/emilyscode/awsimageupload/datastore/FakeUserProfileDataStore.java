package com.emilyscode.awsimageupload.datastore;


import com.emilyscode.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), username: "janetjones", userProfileImageLink: null));
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), username: "antoniojunior", userProfileImageLink: null));
    }

    public static List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
