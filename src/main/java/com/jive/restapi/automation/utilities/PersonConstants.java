package com.jive.restapi.automation.utilities;

import com.jive.restapi.generated.person.models.Email;
import com.jive.restapi.generated.person.models.Jive;
import com.jive.restapi.generated.person.models.Name;
import com.jive.restapi.generated.person.models.Person;
import com.jive.restapi.generated.person.models.PhoneNumber;
import com.jive.restapi.generated.person.models.Profile;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import lombok.NonNull;
import lombok.experimental.UtilityClass;
import lombok.val;
import org.apache.commons.lang.RandomStringUtils;

@UtilityClass
public class PersonConstants {

    private final String DEFAULT_PASSWORD = "test123";
    private final String DEFAULT_FAMILY_NAME = "test123";
    private final String DEFAULT_PHONE_NUMBER = "+911234567890";
    private final String DEFAULT_LOCATION = "India";
    private final String EMAIL_JIVE_LABEL = "Email";
    private final String PHONE_NUMBER_JIVE_LABEL = "Phone Number";
    private final String WORK_TYPE = "Work";

    public static List<Profile> buildProfileList(@NonNull Map<String, String> profileFields) {
        val profile = new ArrayList<Profile>();

        for(Map.Entry<String, String> item : profileFields.entrySet()){
            profile.add(new Profile()
                    .jiveLabel(item.getKey())
                    .value(item.getValue()));
        }

        return profile;
    }

    public static Person getDefaultPersonWithProfile(List<Profile> profile) {
        String userId = RandomStringUtils.randomAlphanumeric(6);
        String givenName = "regularUser-" + userId;
        String emailAddress = "regularUser-" + userId + "@example.com";

        return new Person()
                .addEmailsItem(new Email()
                        .jiveLabel(EMAIL_JIVE_LABEL)
                        .primary(true)
                        .value(emailAddress)
                        .type(WORK_TYPE))
                .jive(new Jive()
                        .username(emailAddress)
                        .password(DEFAULT_PASSWORD)
                        .profile(profile))
                .addPhoneNumbersItem(new PhoneNumber()
                                .jiveLabel(PHONE_NUMBER_JIVE_LABEL)
                                .primary(true)
                                .type(WORK_TYPE.toLowerCase())
                                .value(DEFAULT_PHONE_NUMBER))
                .location(DEFAULT_LOCATION)
                .name(new Name()
                        .givenName(givenName)
                        .familyName(DEFAULT_FAMILY_NAME));
    }
}
