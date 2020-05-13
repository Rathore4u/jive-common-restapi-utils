package com.jive.restapi.automation.data;

import lombok.experimental.UtilityClass;

@UtilityClass
public class ContentConsts {
    public static final String SHOW_IMAGE_SERVER_URL = "%sservlet/JiveServlet/showImage/%s/image.jpeg";
    public static final String DOWNLOAD_IMAGE_SERVER_URL = "%sservlet/JiveServlet/downloadImage/%s/image.jpeg";
    public static final String IMAGE_IN_RTE_SNIPPET = "<p>%s</p><p>"
            + "<a href=\"%s\">"
            + "<img alt=\"\" class=\"image-1 jive-image\" "
            + "src=\"%s\"/></a></p>";
    public static final String VIDEO_IN_RTE_SNIPPET = "<p>%s</p><p>"
            + "<div class=\"jive-video-view jive-content-video\" "
            + "data-browse-id=\"1533\" data-object-id=\"%s\" data-object-type=\"3227383\" "
            + "data-video-id=\"%s\" style=\"\"><img class=\"video_plugin_macro\" height=\"328\" "
            + "src=\"%svideos/%s/image?sourceObjectType=3227383&amp;"
            + "sourceObjectID=%s\" width=\"520\"/> </div></p>";

}
