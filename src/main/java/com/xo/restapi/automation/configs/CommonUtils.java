package com.xo.restapi.automation.configs;

import com.jive.restapi.automation.data.UrlConsts;
import com.jive.restapi.generated.person.models.Place;
import lombok.experimental.UtilityClass;

@UtilityClass
public class CommonUtils {

    public static String getBaseUrl(){
        // Jive projects wants the final slash
        return BaseUrlUtil.getBaseUrl("stage")+"/";
    }

    public static String getParentPlaceUri(Place place) {
        return getBaseUrl()+ UrlConsts.CORE_API + "/places/" + place.getPlaceID();
    }
}
